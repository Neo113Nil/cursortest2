package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core;

import A00.a;
import Sh.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.FooterControlDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.PinnedReviewDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewFooter;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewWidgetVH;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.PinnedReviewDecorator;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.PinnedReviewView;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u000289B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070*0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001c\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u000204038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/di/PinnedReviewComponent;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldVO", "(LA00/a$J$a;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "oldItem", "handleUpdate", "newItem", "", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewViewMapper$PinnedReviewPayload;", "getPayload", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewWidgetVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewMapper;", "getMapper", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewMapper;", "mapper", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "PinnedReviewExpandUpdateKey", "PinnedReviewPayload", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PinnedReviewViewMapper extends WidgetViewMapper2<PinnedReviewComponent, PinnedReviewDTO, PinnedReviewVO> {

    @NotNull
    private final Function2<View, ComposerReferences, PinnedReviewWidgetVH> holderProducer = new PinnedReviewViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(PinnedReviewExpandUpdateKey.class, ReviewVoteUpdateKey.class);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewViewMapper$PinnedReviewExpandUpdateKey;", "LA00/a$J$a;", "", "voId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinnedReviewExpandUpdateKey implements a.J.InterfaceC0007a {
        private final long voId;

        public PinnedReviewExpandUpdateKey(long j11) {
            this.voId = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PinnedReviewExpandUpdateKey) && this.voId == ((PinnedReviewExpandUpdateKey) other).voId;
        }

        public final long getVoId() {
            return this.voId;
        }

        public int hashCode() {
            return Long.hashCode(this.voId);
        }

        @NotNull
        public String toString() {
            return b.b(this.voId, "PinnedReviewExpandUpdateKey(voId=", ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewViewMapper$PinnedReviewPayload;", "", "<init>", "(Ljava/lang/String;I)V", "EXPAND", "COLLAPSE", "VOTE", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PinnedReviewPayload {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PinnedReviewPayload[] $VALUES;
        public static final PinnedReviewPayload EXPAND = new PinnedReviewPayload("EXPAND", 0);
        public static final PinnedReviewPayload COLLAPSE = new PinnedReviewPayload("COLLAPSE", 1);
        public static final PinnedReviewPayload VOTE = new PinnedReviewPayload("VOTE", 2);

        private static final /* synthetic */ PinnedReviewPayload[] $values() {
            return new PinnedReviewPayload[]{EXPAND, COLLAPSE, VOTE};
        }

        static {
            PinnedReviewPayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private PinnedReviewPayload(String str, int i11) {
        }

        public static PinnedReviewPayload valueOf(String str) {
            return (PinnedReviewPayload) Enum.valueOf(PinnedReviewPayload.class, str);
        }

        public static PinnedReviewPayload[] values() {
            return (PinnedReviewPayload[]) $VALUES.clone();
        }
    }

    private final PinnedReviewVO update(a.J.InterfaceC0007a update, PinnedReviewVO oldVO) {
        if (update instanceof PinnedReviewExpandUpdateKey) {
            return oldVO.getId() == ((PinnedReviewExpandUpdateKey) update).getVoId() ? PinnedReviewVO.copy$default(oldVO, 0L, null, null, null, false, null, null, null, 239, null) : oldVO;
        }
        if (!(update instanceof ReviewVoteUpdateKey)) {
            return oldVO;
        }
        ReviewVoteUpdateKey reviewVoteUpdateKey = (ReviewVoteUpdateKey) update;
        if (oldVO.getId() != reviewVoteUpdateKey.getVoId()) {
            return oldVO;
        }
        PinnedReviewFooter footer = oldVO.getFooter();
        FooterControlDTO like = oldVO.getFooter().getLike();
        FooterControlDTO copy$default = like != null ? FooterControlDTO.copy$default(like, reviewVoteUpdateKey.getLiked(), null, null, 6, null) : null;
        FooterControlDTO dislike = oldVO.getFooter().getDislike();
        return PinnedReviewVO.copy$default(oldVO, 0L, null, null, PinnedReviewFooter.copy$default(footer, copy$default, dislike != null ? FooterControlDTO.copy$default(dislike, reviewVoteUpdateKey.getDisliked(), null, null, 6, null) : null, null, 4, null), false, null, null, null, 247, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PinnedReviewDecorator> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new PinnedReviewDecorator(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PinnedReviewWidgetVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PinnedReviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PinnedReviewComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public PinnedReviewView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new PinnedReviewView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public PinnedReviewMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PinnedReviewPayload> getPayload(@NotNull PinnedReviewVO oldItem, @NotNull PinnedReviewVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIsCollapsed() != newItem.getIsCollapsed()) {
            arrayList.add(newItem.getIsCollapsed() ? PinnedReviewPayload.COLLAPSE : PinnedReviewPayload.EXPAND);
        }
        FooterControlDTO dislike = oldItem.getFooter().getDislike();
        Boolean valueOf = dislike != null ? Boolean.valueOf(dislike.isSelected()) : null;
        FooterControlDTO dislike2 = newItem.getFooter().getDislike();
        if (Intrinsics.d(valueOf, dislike2 != null ? Boolean.valueOf(dislike2.isSelected()) : null)) {
            FooterControlDTO like = oldItem.getFooter().getLike();
            Boolean valueOf2 = like != null ? Boolean.valueOf(like.isSelected()) : null;
            FooterControlDTO like2 = newItem.getFooter().getLike();
            if (Intrinsics.d(valueOf2, like2 != null ? Boolean.valueOf(like2.isSelected()) : null)) {
                return arrayList;
            }
        }
        arrayList.add(PinnedReviewPayload.VOTE);
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public PinnedReviewVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PinnedReviewVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update(update, oldItem);
    }
}
