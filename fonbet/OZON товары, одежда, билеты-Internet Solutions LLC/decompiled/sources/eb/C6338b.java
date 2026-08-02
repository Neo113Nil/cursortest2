package eb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: eb.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6338b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f62081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62082b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62084d;

    /* renamed from: e, reason: collision with root package name */
    private final String f62085e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62086f;

    /* renamed from: g, reason: collision with root package name */
    private final String f62087g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC6337a f62088h;

    public C6338b(@NotNull String title, String str, String str2, String str3, String str4, String str5, String str6, EnumC6337a enumC6337a) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f62081a = title;
        this.f62082b = str;
        this.f62083c = str2;
        this.f62084d = str3;
        this.f62085e = str4;
        this.f62086f = str5;
        this.f62087g = str6;
        this.f62088h = enumC6337a;
    }

    public final String a() {
        return this.f62082b;
    }

    public final String b() {
        return this.f62086f;
    }

    public final String c() {
        return this.f62087g;
    }

    public final EnumC6337a d() {
        return this.f62088h;
    }

    public final String e() {
        return this.f62084d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6338b)) {
            return false;
        }
        C6338b c6338b = (C6338b) obj;
        return Intrinsics.d(this.f62081a, c6338b.f62081a) && Intrinsics.d(this.f62082b, c6338b.f62082b) && Intrinsics.d(this.f62083c, c6338b.f62083c) && Intrinsics.d(this.f62084d, c6338b.f62084d) && Intrinsics.d(this.f62085e, c6338b.f62085e) && Intrinsics.d(this.f62086f, c6338b.f62086f) && Intrinsics.d(this.f62087g, c6338b.f62087g) && this.f62088h == c6338b.f62088h;
    }

    public final String f() {
        return this.f62083c;
    }

    public final String g() {
        return this.f62085e;
    }

    @NotNull
    public final String h() {
        return this.f62081a;
    }

    public final int hashCode() {
        int hashCode = this.f62081a.hashCode() * 31;
        String str = this.f62082b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f62083c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62084d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f62085e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f62086f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f62087g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        EnumC6337a enumC6337a = this.f62088h;
        return hashCode7 + (enumC6337a != null ? enumC6337a.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "NotificationPayload(title=" + this.f62081a + ", body=" + this.f62082b + ", icon=" + this.f62083c + ", color=" + this.f62084d + ", image=" + this.f62085e + ", channelId=" + this.f62086f + ", clickAction=" + this.f62087g + ", clickActionType=" + this.f62088h + ')';
    }
}
