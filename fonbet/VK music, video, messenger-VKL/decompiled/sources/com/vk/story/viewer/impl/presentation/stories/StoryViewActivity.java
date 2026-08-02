package com.vk.story.viewer.impl.presentation.stories;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.impl.presentation.stories.b;
import com.vk.story.viewer.impl.presentation.stories.view.TransferableViewerState;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.anm0;
import xsna.ays;
import xsna.c4g0;
import xsna.d6q0;
import xsna.dhr0;
import xsna.fsk;
import xsna.gan;
import xsna.gzs;
import xsna.inm0;
import xsna.j6i;
import xsna.jfy;
import xsna.kfy;
import xsna.m7m;
import xsna.oen;
import xsna.p90;
import xsna.q7m0;
import xsna.qlm0;
import xsna.qo6;
import xsna.s3q0;
import xsna.smm0;
import xsna.tb0;
import xsna.tj2;
import xsna.u8m0;
import xsna.u90;
import xsna.v5m0;
import xsna.vrl0;
import xsna.xa4;
import xsna.y1q0;

/* loaded from: classes11.dex */
public class StoryViewActivity extends VKActivity implements b.k, ays.a {
    public static final /* synthetic */ int H = 0;
    public CopyOnWriteArrayList A;
    public final StoryViewerComponent C;
    public final v5m0 D;
    public final anm0 E;

    @Nullable
    public jfy F;
    public final inm0 G;
    public com.vk.story.viewer.impl.presentation.stories.b v;

    @Nullable
    public ays w;
    public vrl0 z;
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint x = MobileOfficialAppsConStoriesStat$ViewEntryPoint.SNIPPET;
    public String y = "unknown";
    public final y1q0 B = new y1q0();

    /* loaded from: classes6.dex */
    public class a implements gzs<s3q0> {
        public a() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            StoryViewActivity.this.finish();
            return s3q0.a;
        }
    }

    /* loaded from: classes6.dex */
    public class b implements gzs<com.vk.story.viewer.impl.presentation.stories.b> {
        public b() {
        }

        @Override // xsna.gzs
        public final com.vk.story.viewer.impl.presentation.stories.b invoke() {
            return StoryViewActivity.this.v;
        }
    }

    public StoryViewActivity() {
        StoryViewerComponent storyViewerComponent = (StoryViewerComponent) j6i.b(m7m.f(this), StoryViewerComponent.class);
        this.C = storyViewerComponent;
        this.D = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).u5();
        this.E = storyViewerComponent.l9();
        this.G = new inm0(new b(), new a(), StoryViewerKBHPolicy.PAUSE);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void G0(boolean z) {
        if (this.w == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.w);
        } else {
            viewTreeObserver.removeOnGlobalLayoutListener(this.w);
        }
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.A == null) {
            this.A = new CopyOnWriteArrayList();
        }
        this.A.add(tb0Var);
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, xsna.too0
    public final void Ng() {
        super.Ng();
        recreate();
    }

    @Override // com.vk.core.ui.themes.ThemableActivity
    public final boolean Q1() {
        return true;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.v.C(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final boolean g1() {
        return false;
    }

    @Override // xsna.ays.a
    public final boolean isPaused() {
        com.vk.story.viewer.impl.presentation.stories.b bVar = this.v;
        if (bVar == null || bVar.getSelectedStoryView() == null || this.v.getSelectedStoryView().getStoriesContainer() == null) {
            return true;
        }
        return !fsk.A(this.v.getSelectedStoryView().getStoriesContainer());
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void k(Intent intent) {
        startActivityForResult(intent, 9091);
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final u90 k1() {
        return xa4.L(this);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.v.K(i, i2, intent);
        CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        qo6 selectedStoryView = this.v.getSelectedStoryView();
        if (selectedStoryView != null) {
            long currentTime = selectedStoryView.getCurrentTime();
            StoryEntry currentStoryEntry = this.v.getCurrentStoryEntry();
            StoriesContainer storiesContainer = selectedStoryView.getStoriesContainer();
            if (currentStoryEntry != null && (mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.x) != null) {
                this.E.t(StoryViewAction.CLOSE_BACK_BUTTON, mobileOfficialAppsConStoriesStat$ViewEntryPoint, currentStoryEntry, u8m0.a(currentTime, storiesContainer, selectedStoryView.getDuration(), currentStoryEntry), this.y, null);
            }
        }
        super.onBackPressed();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c4g0.B(Long.valueOf(SystemClock.elapsedRealtime()));
        setTheme(!oen.a() ? dhr0.L() ? R.style.StoryFullscreenActivityTheme : R.style.StoryFullscreenActivityThemeDark : dhr0.L() ? R.style.StoryViewActivityTheme : R.style.StoryViewActivityThemeDark);
        super.onCreate(bundle);
        StoriesComponent storiesComponent = (StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class);
        NarrativeComponent narrativeComponent = (NarrativeComponent) j6i.b(m7m.f(this), NarrativeComponent.class);
        StoryViewerComponent storyViewerComponent = (StoryViewerComponent) j6i.b(m7m.f(this), StoryViewerComponent.class);
        StoryStatisticsComponent storyStatisticsComponent = (StoryStatisticsComponent) j6i.b(m7m.f(this), StoryStatisticsComponent.class);
        CommonEditorComponent commonEditorComponent = (CommonEditorComponent) j6i.b(m7m.f(this), CommonEditorComponent.class);
        BridgeComponent bridgeComponent = (BridgeComponent) j6i.b(m7m.f(this), BridgeComponent.class);
        MarketComponent marketComponent = (MarketComponent) j6i.b(m7m.f(this), MarketComponent.class);
        AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) j6i.b(m7m.f(this), AudienceResearchComponent.class);
        Intent intent = getIntent();
        UserId userId = (UserId) intent.getParcelableExtra("open_story_uid");
        if (userId == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        String stringExtra = intent.getStringExtra("open_story");
        String str = stringExtra == null ? "" : stringExtra;
        this.z = storyViewerComponent.V2();
        new WeakReference(this.z);
        q7m0 q7m0Var = new q7m0(str);
        qlm0 qlm0Var = new qlm0(storiesComponent.b(), storiesComponent.o7(), narrativeComponent.n4(), narrativeComponent.V7(), storiesComponent.fb(), this.E, storyViewerComponent.tb(), storyViewerComponent.Wd(), storyViewerComponent.z3(), commonEditorComponent.Ha(), storyViewerComponent.lb(), storyViewerComponent.b(), storiesComponent.b7(), storyViewerComponent.w9(), storiesComponent.eb(), storiesComponent.r2(), storiesComponent.w(), storyViewerComponent.g9(), q7m0Var, new smm0(q7m0Var, new WeakReference(this.z), this.D), storyStatisticsComponent.h7(), bridgeComponent.t().b(), marketComponent.l7(), bridgeComponent.s(), audienceResearchComponent);
        qlm0Var.b().o();
        this.B.b();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("stories_containers");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            gan.a((StoriesContainer) parcelableArrayListExtra.get(0), parcelableArrayListExtra, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
        }
        long longExtra = intent.getLongExtra("start_time", SystemClock.elapsedRealtime());
        boolean booleanExtra = intent.getBooleanExtra("global_layout_listener", false);
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = (MobileOfficialAppsConStoriesStat$ViewEntryPoint) intent.getSerializableExtra("view_entry_point");
        this.x = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == null) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.SNIPPET;
        }
        this.x = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        String stringExtra2 = intent.getStringExtra("ref");
        this.y = stringExtra2;
        if (stringExtra2 == null) {
            stringExtra2 = "unknown";
        }
        this.y = stringExtra2;
        String stringExtra3 = intent.getStringExtra("track_code");
        this.z.i(longExtra, q7m0Var, new tj2(24), this.x);
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2 = this.x;
        this.v = new com.vk.story.viewer.impl.presentation.stories.b(this, mobileOfficialAppsConStoriesStat$ViewEntryPoint2, mobileOfficialAppsConStoriesStat$ViewEntryPoint2, this.y, stringExtra3, null, true, this, parcelableArrayListExtra, fsk.N(userId2), stringExtra, com.vk.story.api.a.b(intent), this.B, qlm0Var, new WeakReference(this.z), 1.0f);
        Parcelable parcelableExtra = intent.getParcelableExtra("transferable_state");
        this.v.z(parcelableExtra instanceof TransferableViewerState ? (TransferableViewerState) parcelableExtra : null);
        setContentView(this.v);
        if (booleanExtra) {
            this.F = kfy.a(this, getWindow());
        } else {
            ays aysVar = new ays(this, getWindow(), (ViewGroup) getWindow().getDecorView());
            this.w = aysVar;
            aysVar.a(this);
        }
        p90.b(this, getColor(R.color.vk_black), false);
        d6q0.b(this.G);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.v.L();
        this.B.a();
        this.z.onDestroy();
        d6q0.f(this.G);
        super.onDestroy();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.v.M();
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        jfy jfyVar = this.F;
        if (jfyVar != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(jfyVar);
        }
        ays aysVar = this.w;
        if (aysVar != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(aysVar);
        }
        super.onPause();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.v.N();
        ViewTreeObserver viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
        jfy jfyVar = this.F;
        if (jfyVar != null) {
            viewTreeObserver.addOnGlobalLayoutListener(jfyVar);
        }
        ays aysVar = this.w;
        if (aysVar != null) {
            viewTreeObserver.addOnGlobalLayoutListener(aysVar);
        }
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(tb0Var);
        }
    }

    @Override // com.vk.story.viewer.impl.presentation.stories.b.k
    public final void j(String str) {
    }
}
