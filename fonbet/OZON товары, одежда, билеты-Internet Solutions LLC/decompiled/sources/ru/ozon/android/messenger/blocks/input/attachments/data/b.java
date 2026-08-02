package ru.ozon.android.messenger.blocks.input.attachments.data;

import android.net.Uri;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f85351a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85352b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Uri f85353c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85354d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85355e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f85356f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f85357g;

    public /* synthetic */ b(UUID uuid, String str, Uri uri, String str2, Integer num, Integer num2, int i11) {
        this(uuid, (i11 & 2) != 0 ? null : str, uri, (String) null, str2, num, num2);
    }

    public static b a(b bVar, String str, Uri localUri, String str2, String str3, Integer num, Integer num2, int i11) {
        String str4 = str;
        UUID id2 = bVar.f85351a;
        if ((i11 & 2) != 0) {
            str4 = bVar.f85352b;
        }
        if ((i11 & 4) != 0) {
            localUri = bVar.f85353c;
        }
        if ((i11 & 8) != 0) {
            str2 = bVar.f85354d;
        }
        if ((i11 & 16) != 0) {
            str3 = bVar.f85355e;
        }
        if ((i11 & 32) != 0) {
            num = bVar.f85356f;
        }
        if ((i11 & 64) != 0) {
            num2 = bVar.f85357g;
        }
        Integer num3 = num2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(localUri, "localUri");
        Integer num4 = num;
        String str5 = str3;
        String str6 = str2;
        return new b(id2, str4, localUri, str6, str5, num4, num3);
    }

    public final Integer b() {
        return this.f85357g;
    }

    @NotNull
    public final UUID c() {
        return this.f85351a;
    }

    @NotNull
    public final Uri d() {
        return this.f85353c;
    }

    public final String e() {
        return this.f85355e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85351a, bVar.f85351a) && Intrinsics.d(this.f85352b, bVar.f85352b) && Intrinsics.d(this.f85353c, bVar.f85353c) && Intrinsics.d(this.f85354d, bVar.f85354d) && Intrinsics.d(this.f85355e, bVar.f85355e) && Intrinsics.d(this.f85356f, bVar.f85356f) && Intrinsics.d(this.f85357g, bVar.f85357g);
    }

    public final String f() {
        return this.f85354d;
    }

    public final String g() {
        return this.f85352b;
    }

    public final Integer h() {
        return this.f85356f;
    }

    public final int hashCode() {
        int hashCode = this.f85351a.hashCode() * 31;
        String str = this.f85352b;
        int hashCode2 = (this.f85353c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f85354d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85355e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f85356f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f85357g;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttachmentImageDTO(id=");
        sb2.append(this.f85351a);
        sb2.append(", url=");
        sb2.append(this.f85352b);
        sb2.append(", localUri=");
        sb2.append(this.f85353c);
        sb2.append(", path=");
        sb2.append(this.f85354d);
        sb2.append(", mediaType=");
        sb2.append(this.f85355e);
        sb2.append(", width=");
        sb2.append(this.f85356f);
        sb2.append(", height=");
        return Ep.a.c(sb2, this.f85357g, ")");
    }

    public b(@NotNull UUID id2, String str, @NotNull Uri localUri, String str2, String str3, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(localUri, "localUri");
        this.f85351a = id2;
        this.f85352b = str;
        this.f85353c = localUri;
        this.f85354d = str2;
        this.f85355e = str3;
        this.f85356f = num;
        this.f85357g = num2;
    }
}
