package com.vk.pending;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.vk.api.base.Document;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.upload.impl.b;
import com.vk.upload.impl.tasks.i;
import com.vkontakte.android.attachments.DocumentAttachment;
import xsna.e43;
import xsna.ju90;
import xsna.obr;

/* loaded from: classes4.dex */
public class PendingDocumentAttachment extends DocumentAttachment implements ju90 {
    public static final Serializer.c<PendingDocumentAttachment> CREATOR = new a();
    public int v;

    public class a extends Serializer.c<PendingDocumentAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingDocumentAttachment a(@NonNull Serializer serializer) {
            return new PendingDocumentAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingDocumentAttachment[i];
        }
    }

    public PendingDocumentAttachment(String str, String str2, long j, String str3, UserId userId, int i, String str4) {
        super(str, str2, j, str3, userId, i, str4, "", 0, 0, null);
        this.v = com.vk.upload.impl.a.d.getAndIncrement();
        if (Ib() && str2 != null && str2.startsWith("file:///")) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                ParcelFileDescriptor openFileDescriptor = e43.a.getContentResolver().openFileDescriptor(Uri.parse(str2), "r");
                if (openFileDescriptor != null) {
                    BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
                    openFileDescriptor.close();
                    this.l = options.outWidth;
                    this.m = options.outHeight;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // xsna.ju90
    public final void O3(int i) {
        this.v = i;
    }

    @Override // xsna.ju90
    public final int S() {
        return this.v;
    }

    @Override // com.vkontakte.android.attachments.DocumentAttachment
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.g.equals(((PendingDocumentAttachment) obj).g);
    }

    @Override // xsna.ju90
    public final String getUri() {
        return this.g;
    }

    @Override // com.vkontakte.android.attachments.DocumentAttachment
    public final int hashCode() {
        String str = this.g;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // xsna.ju90
    public final b y6() {
        i iVar = new i(this.g, obr.g().a().y(), true, false);
        iVar.d = this.v;
        return iVar;
    }

    public PendingDocumentAttachment(Document document) {
        super(document);
        this.v = com.vk.upload.impl.a.d.getAndIncrement();
    }

    public PendingDocumentAttachment(Serializer serializer) {
        super(serializer);
        this.v = com.vk.upload.impl.a.d.getAndIncrement();
    }
}
