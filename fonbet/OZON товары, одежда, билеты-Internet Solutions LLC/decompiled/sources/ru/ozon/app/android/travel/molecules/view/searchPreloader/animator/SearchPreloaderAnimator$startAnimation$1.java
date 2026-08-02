package ru.ozon.app.android.travel.molecules.view.searchPreloader.animator;

import Sc.r;
import Sc.s;
import Wc.a;
import android.animation.Animator;
import androidx.lifecycle.V;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.molecules.extensions.AnimatorExtensionsKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.molecules.view.searchPreloader.animator.SearchPreloaderAnimator$startAnimation$1", f = "SearchPreloaderAnimator.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SearchPreloaderAnimator$startAnimation$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ int $progressEndPoint;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SearchPreloaderAnimator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchPreloaderAnimator$startAnimation$1(SearchPreloaderAnimator searchPreloaderAnimator, int i11, M m11, d<? super SearchPreloaderAnimator$startAnimation$1> dVar) {
        super(2, dVar);
        this.this$0 = searchPreloaderAnimator;
        this.$progressEndPoint = i11;
        this.$coroutineScope = m11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchPreloaderAnimator$startAnimation$1 searchPreloaderAnimator$startAnimation$1 = new SearchPreloaderAnimator$startAnimation$1(this.this$0, this.$progressEndPoint, this.$coroutineScope, dVar);
        searchPreloaderAnimator$startAnimation$1.L$0 = obj;
        return searchPreloaderAnimator$startAnimation$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        float[] progressPoints;
        List animations;
        Iterator it;
        M m11;
        int i11;
        SearchPreloaderAnimator searchPreloaderAnimator;
        String[] strArr;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        try {
            if (i12 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                SearchPreloaderAnimator searchPreloaderAnimator2 = this.this$0;
                int i13 = this.$progressEndPoint;
                M m13 = this.$coroutineScope;
                r.Companion companion = r.INSTANCE;
                progressPoints = searchPreloaderAnimator2.getProgressPoints(i13);
                animations = searchPreloaderAnimator2.getAnimations(m13, progressPoints);
                it = animations.iterator();
                m11 = m12;
                i11 = 0;
                searchPreloaderAnimator = searchPreloaderAnimator2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i14 = this.I$0;
                it = (Iterator) this.L$2;
                searchPreloaderAnimator = (SearchPreloaderAnimator) this.L$1;
                m11 = (M) this.L$0;
                s.b(obj);
                i11 = i14;
            }
            while (N.f(m11) && it.hasNext()) {
                V<String> titleProgress = searchPreloaderAnimator.getTitleProgress();
                strArr = searchPreloaderAnimator.titles;
                int i15 = i11 + 1;
                titleProgress.setValue(strArr[i11]);
                Animator animator = (Animator) it.next();
                animator.start();
                this.L$0 = m11;
                this.L$1 = searchPreloaderAnimator;
                this.L$2 = it;
                this.I$0 = i15;
                this.label = 1;
                if (AnimatorExtensionsKt.awaitCompletion(animator, this) == aVar) {
                    return aVar;
                }
                i11 = i15;
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SearchPreloaderAnimator$startAnimation$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
