package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import Z1.d;
import Z1.s;
import k1.C7460f;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7786D;
import l1.C7790H;
import l1.J0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CornerCutoutPieceShape;", "Ll1/J0;", "LZ1/h;", "cornerRadius", "filletRadius", "endPadding", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lk1/j;", "size", "LZ1/s;", "layoutDirection", "LZ1/d;", "density", "Ll1/p0;", "createOutline-Pq9zytI", "(JLZ1/s;LZ1/d;)Ll1/p0;", "createOutline", "F", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CornerCutoutPieceShape implements J0 {
    private final float cornerRadius;
    private final float endPadding;
    private final float filletRadius;

    public /* synthetic */ CornerCutoutPieceShape(float f7, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, f11, f12);
    }

    @Override // l1.J0
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public AbstractC7839p0 mo1createOutlinePq9zytI(long size, @NotNull s layoutDirection, @NotNull d density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float f7 = C7464j.f(size) - density.v1(this.endPadding);
        float d11 = C7464j.d(size);
        float v12 = density.v1(this.cornerRadius);
        float min = Math.min(f7, d11) / 2.0f;
        if (v12 > min) {
            v12 = min;
        }
        float v13 = density.v1(this.filletRadius);
        float f11 = 2;
        float f12 = f11 * v12;
        float min2 = Math.min(f7, d11) - f12;
        if (min2 < 0.0f) {
            min2 = 0.0f;
        }
        if (v13 > min2) {
            v13 = min2;
        }
        C7786D a11 = C7790H.a();
        a11.a(0.0f, 0.0f);
        a11.b(f7, 0.0f);
        a11.b(f7, d11);
        float f13 = d11 - v12;
        a11.w(new C7460f(f7 - f12, f13, f7, d11 + v12), 0.0f, -90.0f);
        a11.b(v12 + v13, f13);
        float f14 = f11 * v13;
        a11.w(new C7460f(v12, f13 - f14, f14 + v12, f13), 90.0f, 90.0f);
        a11.b(v12, v12);
        a11.w(new C7460f(-v12, 0.0f, v12, f12), 0.0f, -90.0f);
        a11.close();
        return new AbstractC7839p0.a(a11);
    }

    private CornerCutoutPieceShape(float f7, float f11, float f12) {
        this.cornerRadius = f7;
        this.filletRadius = f11;
        this.endPadding = f12;
    }
}
