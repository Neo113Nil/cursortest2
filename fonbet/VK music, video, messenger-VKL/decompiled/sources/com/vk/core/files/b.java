package com.vk.core.files;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.core.files.b;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.internal.operators.single.f0;
import java.io.File;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.ho8;

/* compiled from: GallerySaver.kt */
/* loaded from: classes17.dex */
public final class b {
    public final Context a;

    /* compiled from: GallerySaver.kt */
    public static final class a {
        public final Uri a;
        public final String b;

        public a(Uri uri, String str) {
            this.a = uri;
            this.b = str;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PathUriData(uri=");
            sb.append(this.a);
            sb.append(", path=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: GallerySaver.kt */
    /* renamed from: com.vk.core.files.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0767b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExternalDirType.values().length];
            try {
                iArr[ExternalDirType.IMAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalDirType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExternalDirType.DOWNLOADS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    public static /* synthetic */ f0 c(b bVar, File file, ExternalDirType externalDirType, int i) {
        if ((i & 2) != 0) {
            externalDirType = ExternalDirType.DOWNLOADS;
        }
        return bVar.b(file, externalDirType, file.getName());
    }

    public final f0 a(File file, ExternalDirType externalDirType) {
        return c(this, file, externalDirType, 4);
    }

    public final f0 b(final File file, final ExternalDirType externalDirType, final String str) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new a0() { // from class: xsna.h5t
            @Override // io.reactivex.rxjava3.core.a0
            public final void subscribe(final io.reactivex.rxjava3.core.y yVar) {
                Uri c;
                int i = b.C0767b.$EnumSwitchMapping$0[ExternalDirType.this.ordinal()];
                String str2 = str;
                if (i == 1) {
                    seq seqVar = com.vk.core.files.a.b;
                    Context context = e43.a;
                    ExternalDirType externalDirType2 = ExternalDirType.IMAGES;
                    seqVar.getClass();
                    c = seq.c(context, str2, externalDirType2);
                } else if (i == 2) {
                    seq seqVar2 = com.vk.core.files.a.b;
                    Context context2 = e43.a;
                    ExternalDirType externalDirType3 = ExternalDirType.VIDEO;
                    seqVar2.getClass();
                    c = seq.c(context2, str2, externalDirType3);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    seq seqVar3 = com.vk.core.files.a.b;
                    Context context3 = e43.a;
                    ExternalDirType externalDirType4 = ExternalDirType.DOWNLOADS;
                    seqVar3.getClass();
                    c = seq.c(context3, str2, externalDirType4);
                }
                com.vk.core.files.b bVar = this;
                Context context4 = bVar.a;
                File file2 = file;
                if (!a.b.c(context4, Uri.fromFile(file2), a.c.c(context4, c), null)) {
                    throw new IOException("Can't save file to the MediaStore " + file2 + ' ' + c);
                }
                MediaScannerConnection.OnScanCompletedListener onScanCompletedListener = new MediaScannerConnection.OnScanCompletedListener() { // from class: xsna.i5t
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str3, Uri uri) {
                        io.reactivex.rxjava3.core.y.this.onSuccess(new b.a(uri, str3));
                    }
                };
                bVar.getClass();
                if (!X3.i.b.equals(c.getScheme())) {
                    onScanCompletedListener.onScanCompleted(c.getPath(), c);
                } else {
                    try {
                        MediaScannerConnection.scanFile(bVar.a, new String[]{c.getPath()}, null, onScanCompletedListener);
                    } catch (Exception unused) {
                    }
                }
            }
        }).q(io.reactivex.rxjava3.schedulers.a.b());
    }
}
