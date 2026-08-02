package com.braze.ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010?\u001a\u00020,J\u0010\u0010@\u001a\u00020A2\b\u0010\u000b\u001a\u0004\u0018\u00010,J\u0006\u0010B\u001a\u000204J\u0010\u0010C\u001a\u00020A2\b\u0010\u000b\u001a\u0004\u0018\u000104J&\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020AH\u0016J\b\u0010M\u001a\u00020AH\u0016J\b\u0010N\u001a\u00020AH\u0016J\u0010\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020KH\u0016J\u0012\u0010Q\u001a\u00020A2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\b\u0010R\u001a\u00020AH\u0004J\b\u0010S\u001a\u00020AH\u0004J\u0010\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020\"H\u0004J\u0016\u0010V\u001a\u00020A2\u0006\u0010U\u001a\u00020\"H\u0084@¢\u0006\u0002\u0010WJ\u000e\u0010X\u001a\u00020AH\u0084@¢\u0006\u0002\u0010YJ\u0014\u0010Z\u001a\u00020A2\n\u0010[\u001a\u0006\u0012\u0002\b\u00030<H\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020,X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010,X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010.\"\u0004\b1\u00102R\u0014\u00103\u001a\u000204X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000104X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00106\"\u0004\b9\u0010:R\u0018\u0010;\u001a\u0006\u0012\u0002\b\u00030<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006]"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "networkUnavailableJob", "Lkotlinx/coroutines/Job;", "getNetworkUnavailableJob", "()Lkotlinx/coroutines/Job;", "setNetworkUnavailableJob", "(Lkotlinx/coroutines/Job;)V", "value", "Landroidx/recyclerview/widget/RecyclerView;", "contentCardsRecyclerView", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "cardAdapter", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "defaultEmptyContentCardsAdapter", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "getDefaultEmptyContentCardsAdapter", "()Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "setDefaultEmptyContentCardsAdapter", "(Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;)V", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "getContentCardsUpdatedSubscriber", "()Lcom/braze/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/braze/events/IEventSubscriber;)V", "sdkDataWipeEventSubscriber", "Lcom/braze/events/SdkDataWipeEvent;", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "emptyCardsAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getContentCardUpdateHandler", "setContentCardUpdateHandler", "", "getContentCardsViewBindingHandler", "setContentCardsViewBindingHandler", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRefresh", "onResume", "onPause", "onSaveInstanceState", "outState", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "handleContentCardsUpdatedEvent", "event", "contentCardsUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkUnavailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "swapRecyclerViewAdapter", "newAdapter", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private Job networkUnavailableJob;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    protected final Job getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    protected final void setNetworkUnavailableJob(Job job) {
        this.networkUnavailableJob = job;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    protected final void setContentCardsRecyclerView(RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    protected final EmptyContentCardsAdapter getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    protected final void setDefaultEmptyContentCardsAdapter(EmptyContentCardsAdapter emptyContentCardsAdapter) {
        Intrinsics.checkNotNullParameter(emptyContentCardsAdapter, "<set-?>");
        this.defaultEmptyContentCardsAdapter = emptyContentCardsAdapter;
    }

    protected final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    protected final void setContentCardsSwipeLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    protected final IEventSubscriber<ContentCardsUpdatedEvent> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    protected final void setContentCardsUpdatedSubscriber(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        this.contentCardsUpdatedSubscriber = iEventSubscriber;
    }

    protected final IEventSubscriber<SdkDataWipeEvent> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    protected final void setSdkDataWipeEventSubscriber(IEventSubscriber<SdkDataWipeEvent> iEventSubscriber) {
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    protected final IContentCardsUpdateHandler getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    protected final IContentCardsUpdateHandler getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    protected final void setCustomContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    protected final IContentCardsViewBindingHandler getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    protected final IContentCardsViewBindingHandler getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    protected final void setCustomContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    protected final RecyclerView.Adapter<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler value) {
        this.customContentCardUpdateHandler = value;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler value) {
        this.customContentCardsViewBindingHandler = value;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.com_braze_content_cards, container, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(R.id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R.color.com_braze_content_cards_swipe_refresh_color_1, R.color.com_braze_content_cards_swipe_refresh_color_2, R.color.com_braze_content_cards_swipe_refresh_color_3, R.color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), null, new ContentCardsFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda5
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$0(ContentCardsFragment.this, (ContentCardsUpdatedEvent) obj);
                }
            };
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Braze.Companion companion2 = Braze.INSTANCE;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            companion2.getInstance(requireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Braze.Companion companion3 = Braze.INSTANCE;
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        companion3.getInstance(requireContext3).requestContentCardsRefreshFromCache();
        Braze.Companion companion4 = Braze.INSTANCE;
        Context requireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
        companion4.getInstance(requireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda6
                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.onResume$lambda$2(ContentCardsFragment.this, (SdkDataWipeEvent) obj);
                }
            };
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Braze.Companion companion5 = Braze.INSTANCE;
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            companion5.getInstance(requireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        contentCardsFragment.handleContentCardsUpdatedEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.INSTANCE.getEmptyUpdate());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onPause$lambda$4;
                onPause$lambda$4 = ContentCardsFragment.onPause$lambda$4();
                return onPause$lambda$4;
            }
        }, 6, (Object) null);
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Braze.Companion companion2 = Braze.INSTANCE;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        companion2.getInstance(requireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        Job job = this.networkUnavailableJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$4() {
        return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        RecyclerView.LayoutManager layoutManager;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            outState.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.onSaveInstanceState());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            outState.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        IContentCardsUpdateHandler iContentCardsUpdateHandler;
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler;
        Object parcelable;
        Object parcelable2;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = savedInstanceState.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsUpdateHandler.class);
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) parcelable2;
            } else {
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) savedInstanceState.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            }
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = savedInstanceState.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsViewBindingHandler.class);
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) parcelable;
            } else {
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) savedInstanceState.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            }
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new ContentCardsFragment$onViewStateRestored$1(savedInstanceState, this, null), 2, null);
        }
        initializeRecyclerView();
    }

    protected final void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            recyclerView4.addItemDecoration(new ContentCardsDividerItemDecoration(requireContext2));
        }
    }

    protected final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new ItemTouchHelper(new SimpleItemTouchHelperCallback(contentCardAdapter)).attachToRecyclerView(this.contentCardsRecyclerView);
        }
    }

    protected final void handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, Dispatchers.getMain(), null, new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this, event, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$10(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object contentCardsUpdate(final ContentCardsUpdatedEvent contentCardsUpdatedEvent, Continuation<? super Unit> continuation) {
        SwipeRefreshLayout swipeRefreshLayout;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String contentCardsUpdate$lambda$10;
                contentCardsUpdate$lambda$10 = ContentCardsFragment.contentCardsUpdate$lambda$10(ContentCardsUpdatedEvent.this);
                return contentCardsUpdate$lambda$10;
            }
        }, 6, (Object) null);
        List<Card> handleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(contentCardsUpdatedEvent);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.replaceCards(handleCardUpdate);
        }
        Job job = this.networkUnavailableJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.networkUnavailableJob = null;
        if (contentCardsUpdatedEvent.getIsFromOfflineStorage() && contentCardsUpdatedEvent.isTimestampOlderThan(60L)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String contentCardsUpdate$lambda$11;
                    contentCardsUpdate$lambda$11 = ContentCardsFragment.contentCardsUpdate$lambda$11();
                    return contentCardsUpdate$lambda$11;
                }
            }, 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            companion.getInstance(requireContext).requestContentCardsRefresh();
            if (handleCardUpdate.isEmpty()) {
                SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(true);
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String contentCardsUpdate$lambda$12;
                        contentCardsUpdate$lambda$12 = ContentCardsFragment.contentCardsUpdate$lambda$12();
                        return contentCardsUpdate$lambda$12;
                    }
                }, 7, (Object) null);
                Job job2 = this.networkUnavailableJob;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.networkUnavailableJob = BrazeCoroutineScope.INSTANCE.launchDelayed(Boxing.boxLong(5000L), Dispatchers.getMain(), new ContentCardsFragment$contentCardsUpdate$5(this, null));
                return Unit.INSTANCE;
            }
        }
        List<Card> list = handleCardUpdate;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Card) it.next()).isControl()) {
                    ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
                    if (contentCardAdapter2 != null) {
                        swapRecyclerViewAdapter(contentCardAdapter2);
                    }
                    swipeRefreshLayout = this.contentCardsSwipeLayout;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((Card) it2.next()).logImpression();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$11() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$12() {
        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String networkUnavailable$lambda$16() {
        return "Displaying network unavailable toast.";
    }

    protected final Object networkUnavailable(Continuation<? super Unit> continuation) {
        Context applicationContext;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String networkUnavailable$lambda$16;
                networkUnavailable$lambda$16 = ContentCardsFragment.networkUnavailable$lambda$16();
                return networkUnavailable$lambda$16;
            }
        }, 6, (Object) null);
        Context context = getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            Toast.makeText(applicationContext, applicationContext.getString(R.string.com_braze_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    protected final void swapRecyclerViewAdapter(RecyclerView.Adapter<?> newAdapter) {
        Intrinsics.checkNotNullParameter(newAdapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.getAdapter() == newAdapter) {
            return;
        }
        recyclerView.setAdapter(newAdapter);
    }
}
