package ru.ozon.android.messenger.blocks.snackbar;

import Sc.s;
import android.content.Context;
import android.view.ViewGroup;
import androidx.core.app.n;
import androidx.lifecycle.K;
import io.sentry.android.core.A;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.snackbar.view.SnackbarContainer;
import ru.ozon.android.messenger.framework.core.viewmapper.b;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.databinding.MBlockSnackbarBinding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.Y;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.b<SnackbarDTO, SnackbarVO, MBlockSnackbarBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f86428b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.c f86429c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f86430d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f86431e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<String, SnackbarDTO> f86432f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function2<SnackbarDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<SnackbarVO>> f86433g;

    @e(c = "ru.ozon.android.messenger.blocks.snackbar.SnackbarNoUiViewMapper$handleTtl$1", f = "SnackbarNoUiViewMapper.kt", l = {132}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f86434d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f86435e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f86436f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f86437g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SnackbarVO f86438h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, c cVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar, SnackbarVO snackbarVO, d<? super a> dVar) {
            super(2, dVar);
            this.f86435e = j11;
            this.f86436f = cVar;
            this.f86437g = aVar;
            this.f86438h = snackbarVO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f86435e, this.f86436f, this.f86437g, this.f86438h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f86434d;
            if (i11 == 0) {
                s.b(obj);
                long millis = TimeUnit.SECONDS.toMillis(this.f86435e);
                this.f86434d = 1;
                if (Y.b(millis, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            String a11 = this.f86438h.getBlockId().a();
            this.f86436f.getClass();
            this.f86437g.t(a11);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<SnackbarDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends SnackbarVO>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f86439b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends SnackbarVO> invoke(SnackbarDTO snackbarDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            SnackbarDTO state = snackbarDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            String title = state.getTitle();
            String description = state.getDescription();
            Long ttl = state.getTtl();
            AtomActionDTO hideAction = state.getHideAction();
            AtomActionDTO tapAction = state.getTapAction();
            IconContainerDTO leftIcon = state.getLeftIcon();
            IconContainer iconContainer = leftIcon == null ? null : new IconContainer(leftIcon.getBackgroundColor(), leftIcon.getIcon());
            TimerViewDTO timer = state.getTimer();
            return C7714v.a0(new SnackbarVO(blockId, title, description, ttl, hideAction, tapAction, iconContainer, timer != null ? new TimerViewVO(timer.getTtl()) : null, state.getButton(), state.getRightIcon(), state.getTrackingInfo()));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.snackbar.c$c, reason: collision with other inner class name */
    static final class C1531c extends AbstractC7737t implements Function1<String, SnackbarDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1531c(JsonParser jsonParser) {
            super(1);
            this.f86440b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final SnackbarDTO invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return (SnackbarDTO) this.f86440b.fromJson(it, SnackbarDTO.class);
        }
    }

    public c(@NotNull JsonParser jsonDeserializer, @NotNull Context context, @NotNull ru.ozon.android.messenger.framework.core.c featureProvider) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureProvider, "featureProvider");
        this.f86428b = context;
        this.f86429c = featureProvider;
        this.f86432f = new C1531c(jsonDeserializer);
        this.f86433g = b.f86439b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n(SnackbarVO snackbarVO, ViewGroup viewGroup, ru.ozon.android.messenger.framework.navigation.controller.a aVar) {
        long j11;
        long longValue;
        c cVar;
        TimerViewVO timer = snackbarVO.getTimer();
        if (timer != null) {
            longValue = timer.getTtl();
        } else {
            Long ttl = snackbarVO.getTtl();
            if (ttl == null) {
                j11 = 0;
                if (j11 != 0) {
                    return;
                }
                b.C1565b g10 = g(viewGroup);
                B0 b02 = null;
                if (g10 != null) {
                    cVar = this;
                    b02 = C10727i.c(K.a(g10), null, null, new a(j11, cVar, aVar, snackbarVO, null), 3);
                } else {
                    cVar = this;
                }
                cVar.f86431e = b02;
                return;
            }
            longValue = ttl.longValue();
        }
        j11 = longValue;
        if (j11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MBlockSnackbarBinding mBlockSnackbarBinding, ru.ozon.android.messenger.framework.core.d references, SnackbarVO snackbarVO) {
        MBlockSnackbarBinding binding = mBlockSnackbarBinding;
        SnackbarVO viewObject = snackbarVO;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ViewGroup e11 = ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView);
        e11.addView(binding.getConstraintLayout());
        SnackbarContainer constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        layoutParams.width = -1;
        constraintLayout.setLayoutParams(layoutParams);
        e11.addOnLayoutChangeListener(new ru.ozon.android.messenger.blocks.snackbar.b(e11));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MBlockSnackbarBinding binding = (MBlockSnackbarBinding) aVar;
        SnackbarVO viewObject = (SnackbarVO) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.snackbar.d(viewObject, ru.ozon.android.messenger.utils.g.f(references.d()));
        binding.snackbarContainer.b(new A(references, viewObject, this));
        binding.snackbar.setOnClickListener(new Gt.a(3, references, viewObject));
        binding.snackbar.e(new ru.ozon.android.messenger.blocks.snackbar.a(references, viewObject));
        binding.snackbar.setClickable(viewObject.getTapAction() != null);
        n(viewObject, rootView, references.c());
        references.c().s(viewObject.getTrackingInfo());
        this.f86430d = true;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        Context context = this.f86428b;
        Intrinsics.checkNotNullParameter(context, "context");
        return (n.e(context).a() || this.f86430d || !this.f86429c.a("snackbar_for_push")) ? false : true;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<SnackbarDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<SnackbarVO>> getMapper() {
        return this.f86433g;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, SnackbarDTO> getParser() {
        return this.f86432f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MBlockSnackbarBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockSnackbarBinding inflate = MBlockSnackbarBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), rootView, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MBlockSnackbarBinding mBlockSnackbarBinding, ru.ozon.android.messenger.framework.core.d references) {
        MBlockSnackbarBinding binding = mBlockSnackbarBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        B0 b02 = this.f86431e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f86431e = null;
        binding.getConstraintLayout().animate().setDuration(200L).translationYBy(r3.getHeight()).withEndAction(new Z.c(1, ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), binding)).start();
    }
}
