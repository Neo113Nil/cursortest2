package me;

import android.content.Context;
import android.graphics.Bitmap;
import com.sports.insider.ui.prediction.PredictionFragment;
import eg.m0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public PredictionFragment f20666b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f20667c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f20668d;

    /* renamed from: e, reason: collision with root package name */
    public String f20669e;

    /* renamed from: f, reason: collision with root package name */
    public int f20670f;

    /* renamed from: g, reason: collision with root package name */
    public int f20671g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f20672h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PredictionFragment f20673i;
    public final /* synthetic */ HashMap j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Set set, PredictionFragment predictionFragment, HashMap hashMap, Continuation continuation) {
        super(2, continuation);
        this.f20672h = set;
        this.f20673i = predictionFragment;
        this.j = hashMap;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f20672h, this.f20673i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:5:0x0064). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i5;
        PredictionFragment predictionFragment;
        HashMap hashMap;
        lf.a aVar = lf.a.f20034a;
        int i10 = this.f20671g;
        if (i10 == 0) {
            h8.b.B(obj);
            it = this.f20672h.iterator();
            i5 = 0;
            predictionFragment = this.f20673i;
            hashMap = this.j;
            while (it.hasNext()) {
            }
            return Unit.f19194a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i5 = this.f20670f;
        String str = this.f20669e;
        Iterator it2 = this.f20668d;
        HashMap hashMap2 = this.f20667c;
        predictionFragment = this.f20666b;
        h8.b.B(obj);
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            hashMap2.put(str, bitmap);
        }
        it = it2;
        hashMap = hashMap2;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 != null) {
                Context context = predictionFragment.getContext();
                this.f20666b = predictionFragment;
                this.f20667c = hashMap;
                this.f20668d = it;
                this.f20669e = str2;
                this.f20670f = i5;
                this.f20671g = 1;
                lg.e eVar = m0.f9201a;
                Object A = eg.c0.A(lg.d.f20063c, new m2.f0(context, str2, predictionFragment, (Continuation) null, 3), this);
                if (A == aVar) {
                    return aVar;
                }
                it2 = it;
                obj = A;
                str = str2;
                hashMap2 = hashMap;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                }
                it = it2;
                hashMap = hashMap2;
                while (it.hasNext()) {
                }
            }
        }
        return Unit.f19194a;
    }
}
