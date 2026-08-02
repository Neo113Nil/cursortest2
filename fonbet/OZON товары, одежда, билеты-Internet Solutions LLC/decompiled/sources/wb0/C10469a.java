package wb0;

import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10469a implements InterfaceC10470b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f103732a;

    /* renamed from: b, reason: collision with root package name */
    private final String f103733b;

    /* renamed from: c, reason: collision with root package name */
    private final String f103734c;

    /* renamed from: d, reason: collision with root package name */
    private final String f103735d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f103736e;

    /* renamed from: f, reason: collision with root package name */
    private final String f103737f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f103738g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f103739h;

    /* renamed from: i, reason: collision with root package name */
    private final String f103740i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final L f103741j;

    public C10469a(@NotNull String incidentId, String str, String str2, String str3, Boolean bool, String str4, Long l11, Boolean bool2, String str5, @NotNull L response) {
        Intrinsics.checkNotNullParameter(incidentId, "incidentId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f103732a = incidentId;
        this.f103733b = str;
        this.f103734c = str2;
        this.f103735d = str3;
        this.f103736e = bool;
        this.f103737f = str4;
        this.f103738g = l11;
        this.f103739h = bool2;
        this.f103740i = str5;
        this.f103741j = response;
    }

    public final Long a() {
        return this.f103738g;
    }

    public final String b() {
        return this.f103737f;
    }

    public final String c() {
        return this.f103734c;
    }

    public final String d() {
        return this.f103735d;
    }

    public final Boolean e() {
        return this.f103736e;
    }

    @NotNull
    public final String f() {
        return this.f103732a;
    }

    public final String g() {
        return this.f103740i;
    }

    public final Boolean h() {
        return this.f103739h;
    }

    @NotNull
    public final L i() {
        return this.f103741j;
    }

    @Override // wb0.InterfaceC10470b
    @NotNull
    public final String id() {
        return this.f103732a;
    }

    public final String j() {
        return this.f103733b;
    }
}
