package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/random/e;", "Lkotlin/random/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "i", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends c implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f71823i = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private int f71825d;

    /* renamed from: h, reason: collision with root package name */
    private int f71829h;

    /* renamed from: c, reason: collision with root package name */
    private int f71824c = 100;

    /* renamed from: e, reason: collision with root package name */
    private int f71826e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f71827f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f71828g = -101;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/e$a;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public e(int i11) {
        int i12 = (i11 >>> 4) ^ 102400;
        this.f71825d = i11;
        this.f71829h = i12;
        for (int i13 = 0; i13 < 64; i13++) {
            d();
        }
    }

    @Override // kotlin.random.c
    public final int b(int i11) {
        return ((-i11) >> 31) & (d() >>> (32 - i11));
    }

    @Override // kotlin.random.c
    public final int d() {
        int i11 = this.f71824c;
        int i12 = i11 ^ (i11 >>> 2);
        this.f71824c = this.f71825d;
        this.f71825d = this.f71826e;
        this.f71826e = this.f71827f;
        int i13 = this.f71828g;
        this.f71827f = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.f71828g = i14;
        int i15 = this.f71829h + 362437;
        this.f71829h = i15;
        return i14 + i15;
    }
}
