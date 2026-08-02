package ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Typeface;
import androidx.core.content.res.g;
import ic.AbstractC7042a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.analytics.i;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.search.databinding.ItemMarkwonRecyclerBinding;
import ru.ozon.uni.core.R$font;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownChatView;", "Lru/ozon/android/messenger/framework/presentation/common/view/recycler/q;", "Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;", "Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;", "binding", "Lru/ozon/android/messenger/framework/core/d;", "references", "Lru/ozon/android/messenger/framework/analytics/i;", "trackerAnalyticsAdapter", "<init>", "(Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;Lru/ozon/android/messenger/framework/core/d;Lru/ozon/android/messenger/framework/analytics/i;)V", "block", "", "trackView", "(Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;)V", "Lru/ozon/android/messenger/framework/presentation/models/p;", "itemInfo", "Lru/ozon/android/messenger/framework/presentation/models/d;", "blockInfo", "", "payload", "bind", "(Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;Lru/ozon/android/messenger/framework/presentation/models/p;Lru/ozon/android/messenger/framework/presentation/models/d;Ljava/lang/Object;)V", "Lru/ozon/android/messenger/framework/analytics/i;", "Lic/a;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lic/a;", "adapter", "Landroid/graphics/Typeface;", "headingFont", "Landroid/graphics/Typeface;", "LUb/d;", "markWon$delegate", "getMarkWon", "()LUb/d;", "markWon", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AIMarkdownChatView extends q<AIMarkdownVO, ItemMarkwonRecyclerBinding> {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;
    private final Typeface headingFont;

    /* renamed from: markWon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j markWon;

    @NotNull
    private final i trackerAnalyticsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownChatView$Companion;", "", "<init>", "()V", "BULLET_GAP_PX", "", "BULLET_RADIUS", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIMarkdownChatView(@NotNull ItemMarkwonRecyclerBinding binding, @NotNull d references, @NotNull i trackerAnalyticsAdapter) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(trackerAnalyticsAdapter, "trackerAnalyticsAdapter");
        this.trackerAnalyticsAdapter = trackerAnalyticsAdapter;
        this.adapter = k.b(AIMarkdownChatView$adapter$2.INSTANCE);
        this.headingFont = g.e(R$font.onest_bold, getContext());
        this.markWon = k.b(new AIMarkdownChatView$markWon$2(this));
        binding.rV.setAdapter(getAdapter());
        binding.rV.setItemAnimator(null);
    }

    private final AbstractC7042a getAdapter() {
        return (AbstractC7042a) this.adapter.getValue();
    }

    private final Ub.d getMarkWon() {
        return (Ub.d) this.markWon.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public void bind(@NotNull AIMarkdownVO block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object payload) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind((AIMarkdownChatView) block, itemInfo, blockInfo, payload);
        getAdapter().g(getMarkWon(), block.getData());
        getAdapter().notifyDataSetChanged();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public void trackView(@NotNull AIMarkdownVO block) {
        Intrinsics.checkNotNullParameter(block, "block");
        super.trackView((AIMarkdownChatView) block);
        Map<String, MessengerTrackingInfo> trackingInfo = block.getTrackingInfo();
        if (trackingInfo != null) {
            h.f(this.trackerAnalyticsAdapter, trackingInfo);
        }
    }
}
