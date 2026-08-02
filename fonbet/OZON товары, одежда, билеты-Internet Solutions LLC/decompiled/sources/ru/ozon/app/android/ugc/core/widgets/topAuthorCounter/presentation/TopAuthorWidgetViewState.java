package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation;

import G.g;
import Nh.a;
import S0.InterfaceC3967k;
import WZ.t;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l1.C7807Z;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.CounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorPaddings;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopContainerDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u000f\u0010\u0011J\u000f\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Ll1/Z;", "backgroundColor-WaAFU9c", "(LS0/k;I)J", "backgroundColor", "topGradientColor-WaAFU9c", "topGradientColor", "", "getBackgroundColorToken", "()Ljava/lang/String;", "backgroundColorToken", "getTopGradientColorToken", "topGradientColorToken", "Counter", "TopAuthor", "TopAuthorWithAnimation", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TopAuthorWidgetViewState extends c {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "counterDTO", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "paddings", "", "backgroundColorToken", "topGradientColorToken", "LWZ/t;", "tracking", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "Lkotlin/Pair;", "Landroidx/compose/ui/e;", "", "getCounterPaddings", "()Lkotlin/Pair;", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "getCounterDTO", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "Ljava/lang/String;", "getBackgroundColorToken", "()Ljava/lang/String;", "getTopGradientColorToken", "LWZ/t;", "getTracking", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Counter implements TopAuthorWidgetViewState {
        private final AtomAction action;
        private final String backgroundColorToken;
        private final CounterDTO counterDTO;
        private final long id;
        private final TopAuthorPaddings paddings;
        private final String topGradientColorToken;
        private final t tracking;

        public Counter(long j11, CounterDTO counterDTO, TopAuthorPaddings topAuthorPaddings, String str, String str2, t tVar, AtomAction atomAction) {
            this.id = j11;
            this.counterDTO = counterDTO;
            this.paddings = topAuthorPaddings;
            this.backgroundColorToken = str;
            this.topGradientColorToken = str2;
            this.tracking = tVar;
            this.action = atomAction;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: backgroundColor-WaAFU9c */
        public long mo1521backgroundColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1523backgroundColorWaAFU9c(this, interfaceC3967k, i11);
        }

        public AtomAction getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        public final CounterDTO getCounterDTO() {
            return this.counterDTO;
        }

        @NotNull
        public final Pair<e, Integer> getCounterPaddings() {
            CounterDTO.CirclesConfigDTO circlesConfig;
            CounterDTO counterDTO = this.counterDTO;
            Integer valueOf = (counterDTO == null || (circlesConfig = counterDTO.getCirclesConfig()) == null) ? null : Integer.valueOf(circlesConfig.getTotalCount());
            IntRange intRange = new IntRange(0, 5, 1);
            if (valueOf == null || !intRange.n(valueOf.intValue())) {
                return (valueOf == null || !new IntRange(6, 8, 1).n(valueOf.intValue())) ? new Pair<>(a0.e(e.f40358c0, 1.0f), 16) : new Pair<>(a0.e(e.f40358c0, 1.0f), 32);
            }
            return new Pair<>(a0.r(e.f40358c0, 240), 0);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public TopAuthorPaddings getPaddings() {
            return this.paddings;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getTopGradientColorToken() {
            return this.topGradientColorToken;
        }

        public t getTracking() {
            return this.tracking;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: topGradientColor-WaAFU9c */
        public long mo1522topGradientColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1524topGradientColorWaAFU9c(this, interfaceC3967k, i11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: backgroundColor-WaAFU9c, reason: not valid java name */
        public static long m1523backgroundColorWaAFU9c(@NotNull TopAuthorWidgetViewState topAuthorWidgetViewState, InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(651668750);
            C7807Z c7807z = TokenParserKt.tokenToColor(topAuthorWidgetViewState.getBackgroundColorToken(), interfaceC3967k, 0);
            long w11 = c7807z != null ? c7807z.w() : C7807Z.f72258l;
            interfaceC3967k.k();
            return w11;
        }

        public static Integer getScrollWidgetKey(@NotNull TopAuthorWidgetViewState topAuthorWidgetViewState) {
            return null;
        }

        public static int getViewItemKey(@NotNull TopAuthorWidgetViewState topAuthorWidgetViewState) {
            return topAuthorWidgetViewState.hashCode();
        }

        /* renamed from: topGradientColor-WaAFU9c, reason: not valid java name */
        public static long m1524topGradientColorWaAFU9c(@NotNull TopAuthorWidgetViewState topAuthorWidgetViewState, InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-277379309);
            C7807Z c7807z = TokenParserKt.tokenToColor(topAuthorWidgetViewState.getTopGradientColorToken(), interfaceC3967k, 0);
            long w11 = c7807z != null ? c7807z.w() : C7807Z.f72258l;
            interfaceC3967k.k();
            return w11;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "topContainer", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "content", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "paddings", "", "backgroundColorToken", "topGradientColorToken", "LWZ/t;", "tracking", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "getTopContainer", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "Ljava/lang/String;", "getBackgroundColorToken", "getTopGradientColorToken", "LWZ/t;", "getTracking", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopAuthor implements TopAuthorWidgetViewState {
        private final AtomAction action;
        private final String backgroundColorToken;

        @NotNull
        private final List<TopAuthorDTO.TopAuthorContent> content;
        private final long id;
        private final TopAuthorPaddings paddings;
        private final TopContainerDTO topContainer;
        private final String topGradientColorToken;
        private final t tracking;

        /* JADX WARN: Multi-variable type inference failed */
        public TopAuthor(long j11, TopContainerDTO topContainerDTO, @NotNull List<? extends TopAuthorDTO.TopAuthorContent> content, TopAuthorPaddings topAuthorPaddings, String str, String str2, t tVar, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = j11;
            this.topContainer = topContainerDTO;
            this.content = content;
            this.paddings = topAuthorPaddings;
            this.backgroundColorToken = str;
            this.topGradientColorToken = str2;
            this.tracking = tVar;
            this.action = atomAction;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: backgroundColor-WaAFU9c */
        public long mo1521backgroundColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1523backgroundColorWaAFU9c(this, interfaceC3967k, i11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopAuthor)) {
                return false;
            }
            TopAuthor topAuthor = (TopAuthor) other;
            return this.id == topAuthor.id && Intrinsics.d(this.topContainer, topAuthor.topContainer) && Intrinsics.d(this.content, topAuthor.content) && Intrinsics.d(this.paddings, topAuthor.paddings) && Intrinsics.d(this.backgroundColorToken, topAuthor.backgroundColorToken) && Intrinsics.d(this.topGradientColorToken, topAuthor.topGradientColorToken) && Intrinsics.d(this.tracking, topAuthor.tracking) && Intrinsics.d(this.action, topAuthor.action);
        }

        public AtomAction getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        @NotNull
        public final List<TopAuthorDTO.TopAuthorContent> getContent() {
            return this.content;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public TopAuthorPaddings getPaddings() {
            return this.paddings;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getTopGradientColorToken() {
            return this.topGradientColorToken;
        }

        public t getTracking() {
            return this.tracking;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            TopContainerDTO topContainerDTO = this.topContainer;
            int b11 = g.b((hashCode + (topContainerDTO == null ? 0 : topContainerDTO.hashCode())) * 31, 31, this.content);
            TopAuthorPaddings topAuthorPaddings = this.paddings;
            int hashCode2 = (b11 + (topAuthorPaddings == null ? 0 : topAuthorPaddings.hashCode())) * 31;
            String str = this.backgroundColorToken;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.topGradientColorToken;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            t tVar = this.tracking;
            int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode5 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TopContainerDTO topContainerDTO = this.topContainer;
            List<TopAuthorDTO.TopAuthorContent> list = this.content;
            TopAuthorPaddings topAuthorPaddings = this.paddings;
            String str = this.backgroundColorToken;
            String str2 = this.topGradientColorToken;
            t tVar = this.tracking;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("TopAuthor(id=");
            sb2.append(j11);
            sb2.append(", topContainer=");
            sb2.append(topContainerDTO);
            sb2.append(", content=");
            sb2.append(list);
            sb2.append(", paddings=");
            sb2.append(topAuthorPaddings);
            a.h(sb2, ", backgroundColorToken=", str, ", topGradientColorToken=", str2);
            sb2.append(", tracking=");
            sb2.append(tVar);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: topGradientColor-WaAFU9c */
        public long mo1522topGradientColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1524topGradientColorWaAFU9c(this, interfaceC3967k, i11);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;", "", "id", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "counter", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "author", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "paddings", "", "backgroundColorToken", "topGradientColorToken", "LWZ/t;", "tracking", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "J", "getId", "()J", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "getCounter", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "getAuthor", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "Ljava/lang/String;", "getBackgroundColorToken", "()Ljava/lang/String;", "getTopGradientColorToken", "LWZ/t;", "getTracking", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TopAuthorWithAnimation implements TopAuthorWidgetViewState {
        private final AtomAction action;

        @NotNull
        private final TopAuthor author;
        private final String backgroundColorToken;

        @NotNull
        private final Counter counter;
        private final long id;
        private final TopAuthorPaddings paddings;
        private final String topGradientColorToken;
        private final t tracking;

        public TopAuthorWithAnimation(long j11, @NotNull Counter counter, @NotNull TopAuthor author, TopAuthorPaddings topAuthorPaddings, String str, String str2, t tVar, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(counter, "counter");
            Intrinsics.checkNotNullParameter(author, "author");
            this.id = j11;
            this.counter = counter;
            this.author = author;
            this.paddings = topAuthorPaddings;
            this.backgroundColorToken = str;
            this.topGradientColorToken = str2;
            this.tracking = tVar;
            this.action = atomAction;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: backgroundColor-WaAFU9c */
        public long mo1521backgroundColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1523backgroundColorWaAFU9c(this, interfaceC3967k, i11);
        }

        @NotNull
        public final TopAuthor getAuthor() {
            return this.author;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        @NotNull
        public final Counter getCounter() {
            return this.counter;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        public String getTopGradientColorToken() {
            return this.topGradientColorToken;
        }

        public t getTracking() {
            return this.tracking;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState
        /* renamed from: topGradientColor-WaAFU9c */
        public long mo1522topGradientColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11) {
            return DefaultImpls.m1524topGradientColorWaAFU9c(this, interfaceC3967k, i11);
        }
    }

    /* renamed from: backgroundColor-WaAFU9c, reason: not valid java name */
    long mo1521backgroundColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11);

    String getBackgroundColorToken();

    String getTopGradientColorToken();

    /* renamed from: topGradientColor-WaAFU9c, reason: not valid java name */
    long mo1522topGradientColorWaAFU9c(InterfaceC3967k interfaceC3967k, int i11);
}
