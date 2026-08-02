package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5889b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f5888a = i5;
        this.f5889b = obj;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i5 = this.f5888a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette lambda$fromArgb$0;
        Double lambda$fromArgb$1;
        Double lambda$getHctsByTemp$0;
        switch (this.f5888a) {
            case 0:
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0((TonalPalette) this.f5889b, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            case 1:
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1((Hct) this.f5889b, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            default:
                lambda$getHctsByTemp$0 = ((TemperatureCache) this.f5889b).lambda$getHctsByTemp$0((Hct) obj);
                return lambda$getHctsByTemp$0;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i5 = this.f5888a;
        return Function$CC.$default$compose(this, function);
    }
}
