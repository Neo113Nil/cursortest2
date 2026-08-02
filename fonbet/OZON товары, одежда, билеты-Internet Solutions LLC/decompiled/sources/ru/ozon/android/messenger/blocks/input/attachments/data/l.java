package ru.ozon.android.messenger.blocks.input.attachments.data;

import C.o0;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f85393a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85394b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85395c;

    public l(Uri uri, String str, String str2) {
        this.f85393a = uri;
        this.f85394b = str;
        this.f85395c = str2;
    }

    public final String a() {
        return this.f85395c;
    }

    public final Uri b() {
        return this.f85393a;
    }

    public final String c() {
        return this.f85394b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f85393a, lVar.f85393a) && Intrinsics.d(this.f85394b, lVar.f85394b) && Intrinsics.d(this.f85395c, lVar.f85395c);
    }

    public final int hashCode() {
        Uri uri = this.f85393a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f85394b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85395c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadFileModel(mediaUri=");
        sb2.append(this.f85393a);
        sb2.append(", uploadUrl=");
        sb2.append(this.f85394b);
        sb2.append(", mediaType=");
        return o0.c(sb2, this.f85395c, ")");
    }
}
