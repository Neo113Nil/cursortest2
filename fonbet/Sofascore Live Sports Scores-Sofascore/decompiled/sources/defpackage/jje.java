package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jje extends hoi implements Function2 {
    public j2d r;
    public kje s;
    public CharSequence t;
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ CharSequence x;
    public final /* synthetic */ long y;
    public final /* synthetic */ kje z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jje(CharSequence charSequence, long j, kje kjeVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = charSequence;
        this.y = j;
        this.z = kjeVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        jje jjeVar = new jje(this.x, this.y, this.z, rq3Var);
        jjeVar.w = obj;
        return jjeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jje) create((TextClassifier) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long j;
        TextSelection textSelection;
        kje kjeVar;
        CharSequence charSequence;
        j2d j2dVar;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        if (i == 0) {
            y6a.M(obj);
            TextClassifier textClassifier = (TextClassifier) this.w;
            long j2 = this.y;
            int g = pej.g(j2);
            int f = pej.f(j2);
            CharSequence charSequence2 = this.x;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, g, f);
            kje kjeVar2 = this.z;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(kjeVar2.c());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long g2 = t6a.g(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            if (i2 < 31 || suggestSelection.getTextClassification() == null) {
                this.u = g2;
                this.v = 2;
                if (kjeVar2.b(this.x, g2, textClassifier, this) != lu3Var) {
                    j = g2;
                }
            } else {
                j2d j2dVar2 = kjeVar2.e;
                this.w = suggestSelection;
                this.r = j2dVar2;
                this.s = kjeVar2;
                this.t = charSequence2;
                this.u = g2;
                this.v = 1;
                if (j2dVar2.e(this) != lu3Var) {
                    textSelection = suggestSelection;
                    kjeVar = kjeVar2;
                    charSequence = charSequence2;
                    j2dVar = j2dVar2;
                    j = g2;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((eoh) kjeVar.g).setValue(new b8j(charSequence, j, textClassification));
                    Unit unit = Unit.a;
                }
            }
            return lu3Var;
        }
        if (i == 1) {
            j = this.u;
            charSequence = this.t;
            kjeVar = this.s;
            j2dVar = this.r;
            textSelection = (TextSelection) this.w;
            y6a.M(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((eoh) kjeVar.g).setValue(new b8j(charSequence, j, textClassification2));
                Unit unit2 = Unit.a;
            } finally {
                j2dVar.f(null);
            }
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.u;
            y6a.M(obj);
        }
        return new pej(j);
    }
}
