package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Sc.r;
import Sc.s;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ReviewGalleryPreviewResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl$loadNextItems$1", f = "ReviewGalleryPreviewViewModel.kt", l = {115, 126, 134}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewViewModelImpl$loadNextItems$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReviewGalleryPreviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewViewModelImpl$loadNextItems$1(ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl, AtomAction.ComposerAction composerAction, d<? super ReviewGalleryPreviewViewModelImpl$loadNextItems$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPreviewViewModelImpl;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewGalleryPreviewViewModelImpl$loadNextItems$1 reviewGalleryPreviewViewModelImpl$loadNextItems$1 = new ReviewGalleryPreviewViewModelImpl$loadNextItems$1(this.this$0, this.$action, dVar);
        reviewGalleryPreviewViewModelImpl$loadNextItems$1.L$0 = obj;
        return reviewGalleryPreviewViewModelImpl$loadNextItems$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (r0 == r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0113 -> B:7:0x0114). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        M m11;
        ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl;
        int i12;
        AtomAction.ComposerAction composerAction;
        int i13;
        Throwable th2;
        Object a11;
        Throwable b11;
        Set set;
        Object emitNextItems;
        Object obj2;
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            s.b(obj);
            i11 = 5;
            m11 = (M) this.L$0;
            reviewGalleryPreviewViewModelImpl = this.this$0;
            i12 = 0;
            composerAction = this.$action;
            if (i12 < i11) {
            }
        } else {
            if (i14 == 1) {
                i12 = this.I$2;
                i13 = this.I$1;
                i11 = this.I$0;
                composerAction = (AtomAction.ComposerAction) this.L$2;
                reviewGalleryPreviewViewModelImpl = (ReviewGalleryPreviewViewModelImpl) this.L$1;
                m11 = (M) this.L$0;
                try {
                    s.b(obj);
                    obj2 = obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    r.Companion companion = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    if (a11 instanceof r.b) {
                    }
                    return aVar;
                }
                a11 = (ReviewGalleryPreviewResponse) ((ActionV2Response) obj2).getData();
                r.Companion companion2 = r.INSTANCE;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                if (a11 instanceof r.b) {
                }
                return aVar;
            }
            if (i14 == 2) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = this.I$1;
            int i16 = this.I$0;
            AtomAction.ComposerAction composerAction2 = (AtomAction.ComposerAction) this.L$2;
            ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl2 = (ReviewGalleryPreviewViewModelImpl) this.L$1;
            M m12 = (M) this.L$0;
            s.b(obj);
            reviewGalleryPreviewViewModelImpl = reviewGalleryPreviewViewModelImpl2;
            m11 = m12;
            i11 = i16;
            composerAction = composerAction2;
            i12 = i15 + 1;
            if (i12 < i11) {
                reviewGalleryPreviewViewModelImpl.updateTimeForNextRequest();
                try {
                } catch (Throwable th4) {
                    th2 = th4;
                    i13 = i12;
                    r.Companion companion3 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    if (a11 instanceof r.b) {
                    }
                    return aVar;
                }
                r.Companion companion4 = r.INSTANCE;
                actionV2Repository = reviewGalleryPreviewViewModelImpl.actionV2Repository;
                String actionName = composerAction.getActionName();
                Map<String, String> params = composerAction.getParams();
                if (params == null) {
                    params = U.c();
                }
                ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
                this.L$0 = m11;
                this.L$1 = reviewGalleryPreviewViewModelImpl;
                this.L$2 = composerAction;
                this.I$0 = i11;
                this.I$1 = i12;
                this.I$2 = i12;
                this.label = 1;
                obj2 = actionV2Repository.callActionSuspend(actionV2Request, ReviewGalleryPreviewResponse.class, this);
                if (obj2 != aVar) {
                    i13 = i12;
                    a11 = (ReviewGalleryPreviewResponse) ((ActionV2Response) obj2).getData();
                    r.Companion companion22 = r.INSTANCE;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        a11 = s.a(b11);
                    } else if (a11 == null) {
                        a11 = s.a(new IllegalStateException("Result value is null"));
                    }
                    if (a11 instanceof r.b) {
                        Throwable b12 = r.b(a11);
                        if (b12 != null) {
                            Lm0.a.f17149a.e(b12);
                        }
                        this.L$0 = m11;
                        this.L$1 = reviewGalleryPreviewViewModelImpl;
                        this.L$2 = composerAction;
                        this.I$0 = i11;
                        this.I$1 = i13;
                        this.label = 3;
                        if (Y.b((i12 + 1) * 1000, this) != aVar) {
                            i15 = i13;
                            i12 = i15 + 1;
                            if (i12 < i11) {
                                return Unit.f71690a;
                            }
                        }
                    } else {
                        set = reviewGalleryPreviewViewModelImpl.consumedActions;
                        set.add(composerAction);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        emitNextItems = reviewGalleryPreviewViewModelImpl.emitNextItems((ReviewGalleryPreviewResponse) a11, this);
                    }
                }
                return aVar;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewViewModelImpl$loadNextItems$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
