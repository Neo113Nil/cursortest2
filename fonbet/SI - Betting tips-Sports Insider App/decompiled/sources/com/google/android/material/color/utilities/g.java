package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f5897b;

    public /* synthetic */ g(MaterialDynamicColors materialDynamicColors, int i5) {
        this.f5896a = i5;
        this.f5897b = materialDynamicColors;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i5 = this.f5896a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ToneDeltaPair lambda$secondaryFixed$119;
        DynamicColor lambda$onPrimaryFixedVariant$115;
        DynamicColor lambda$onPrimaryFixedVariant$116;
        ToneDeltaPair lambda$tertiaryFixedDim$136;
        DynamicColor lambda$onTertiary$84;
        DynamicColor lambda$onError$96;
        Double lambda$onPrimaryContainer$62;
        DynamicColor lambda$onPrimaryContainer$63;
        ToneDeltaPair lambda$secondaryFixedDim$122;
        ToneDeltaPair lambda$primaryFixed$105;
        ToneDeltaPair lambda$primaryFixedDim$108;
        Double lambda$tertiaryContainer$86;
        ToneDeltaPair lambda$tertiaryContainer$87;
        switch (this.f5896a) {
            case 0:
                lambda$secondaryFixed$119 = this.f5897b.lambda$secondaryFixed$119((DynamicScheme) obj);
                return lambda$secondaryFixed$119;
            case 1:
                lambda$onPrimaryFixedVariant$115 = this.f5897b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$115;
            case 2:
                lambda$onPrimaryFixedVariant$116 = this.f5897b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$116;
            case 3:
                lambda$tertiaryFixedDim$136 = this.f5897b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
                return lambda$tertiaryFixedDim$136;
            case 4:
                lambda$onTertiary$84 = this.f5897b.lambda$onTertiary$84((DynamicScheme) obj);
                return lambda$onTertiary$84;
            case 5:
                lambda$onError$96 = this.f5897b.lambda$onError$96((DynamicScheme) obj);
                return lambda$onError$96;
            case 6:
                lambda$onPrimaryContainer$62 = this.f5897b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
                return lambda$onPrimaryContainer$62;
            case 7:
                lambda$onPrimaryContainer$63 = this.f5897b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
                return lambda$onPrimaryContainer$63;
            case 8:
                lambda$secondaryFixedDim$122 = this.f5897b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
                return lambda$secondaryFixedDim$122;
            case 9:
                lambda$primaryFixed$105 = this.f5897b.lambda$primaryFixed$105((DynamicScheme) obj);
                return lambda$primaryFixed$105;
            case 10:
                lambda$primaryFixedDim$108 = this.f5897b.lambda$primaryFixedDim$108((DynamicScheme) obj);
                return lambda$primaryFixedDim$108;
            case 11:
                lambda$tertiaryContainer$86 = this.f5897b.lambda$tertiaryContainer$86((DynamicScheme) obj);
                return lambda$tertiaryContainer$86;
            case 12:
                lambda$tertiaryContainer$87 = this.f5897b.lambda$tertiaryContainer$87((DynamicScheme) obj);
                return lambda$tertiaryContainer$87;
            default:
                return this.f5897b.highestSurface((DynamicScheme) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i5 = this.f5896a;
        return Function$CC.$default$compose(this, function);
    }
}
