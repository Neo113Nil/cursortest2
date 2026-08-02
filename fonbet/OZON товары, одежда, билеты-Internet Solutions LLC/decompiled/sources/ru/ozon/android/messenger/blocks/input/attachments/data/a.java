package ru.ozon.android.messenger.blocks.input.attachments.data;

import C.o0;
import android.net.Uri;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f85344a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85345b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Uri f85346c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85347d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85348e;

    /* renamed from: f, reason: collision with root package name */
    private final String f85349f;

    /* renamed from: g, reason: collision with root package name */
    private final String f85350g;

    public /* synthetic */ a(UUID uuid, String str, Uri uri, String str2, String str3, String str4, int i11) {
        this(uuid, (i11 & 2) != 0 ? null : str, uri, (String) null, str2, str3, str4);
    }

    public static a a(a aVar, String str, String str2, String str3, String str4, String str5, int i11) {
        UUID id2 = aVar.f85344a;
        if ((i11 & 2) != 0) {
            str = aVar.f85345b;
        }
        String str6 = str;
        Uri localUri = aVar.f85346c;
        if ((i11 & 8) != 0) {
            str2 = aVar.f85347d;
        }
        String str7 = str2;
        if ((i11 & 16) != 0) {
            str3 = aVar.f85348e;
        }
        String str8 = str3;
        if ((i11 & 32) != 0) {
            str4 = aVar.f85349f;
        }
        String str9 = str4;
        if ((i11 & 64) != 0) {
            str5 = aVar.f85350g;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(localUri, "localUri");
        return new a(id2, str6, localUri, str7, str8, str9, str5);
    }

    public final String b() {
        return this.f85349f;
    }

    @NotNull
    public final UUID c() {
        return this.f85344a;
    }

    @NotNull
    public final Uri d() {
        return this.f85346c;
    }

    public final String e() {
        return this.f85348e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f85344a, aVar.f85344a) && Intrinsics.d(this.f85345b, aVar.f85345b) && Intrinsics.d(this.f85346c, aVar.f85346c) && Intrinsics.d(this.f85347d, aVar.f85347d) && Intrinsics.d(this.f85348e, aVar.f85348e) && Intrinsics.d(this.f85349f, aVar.f85349f) && Intrinsics.d(this.f85350g, aVar.f85350g);
    }

    public final String f() {
        return this.f85347d;
    }

    public final String g() {
        return this.f85350g;
    }

    public final String h() {
        return this.f85345b;
    }

    public final int hashCode() {
        int hashCode = this.f85344a.hashCode() * 31;
        String str = this.f85345b;
        int hashCode2 = (this.f85346c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f85347d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85348e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85349f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f85350g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttachmentFileDTO(id=");
        sb2.append(this.f85344a);
        sb2.append(", url=");
        sb2.append(this.f85345b);
        sb2.append(", localUri=");
        sb2.append(this.f85346c);
        sb2.append(", path=");
        sb2.append(this.f85347d);
        sb2.append(", mediaType=");
        sb2.append(this.f85348e);
        sb2.append(", filename=");
        sb2.append(this.f85349f);
        sb2.append(", size=");
        return o0.c(sb2, this.f85350g, ")");
    }

    public a(@NotNull UUID id2, String str, @NotNull Uri localUri, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(localUri, "localUri");
        this.f85344a = id2;
        this.f85345b = str;
        this.f85346c = localUri;
        this.f85347d = str2;
        this.f85348e = str3;
        this.f85349f = str4;
        this.f85350g = str5;
    }
}
