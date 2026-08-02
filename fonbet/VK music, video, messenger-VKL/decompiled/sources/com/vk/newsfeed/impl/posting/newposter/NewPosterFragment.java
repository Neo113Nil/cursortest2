package com.vk.newsfeed.impl.posting.newposter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.V5;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.AspectRatioFrameLayout;
import com.vk.attachpicker.widget.AspectRatioLinearLayout;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ImageSize;
import com.vk.medianative.MediaImageEncoder;
import com.vk.newsfeed.impl.posting.newposter.NewPosterFragment;
import com.vk.newsfeed.impl.posting.newposter.NewPosterResult;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.an10;
import xsna.asu0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.eu;
import xsna.fhc0;
import xsna.fux;
import xsna.iah0;
import xsna.ies;
import xsna.iwg0;
import xsna.j860;
import xsna.jbc0;
import xsna.jjc;
import xsna.krv0;
import xsna.kwg0;
import xsna.l84;
import xsna.m33;
import xsna.n3t;
import xsna.nds;
import xsna.p860;
import xsna.r9r;
import xsna.v98;

/* compiled from: NewPosterFragment.kt */
/* loaded from: classes4.dex */
public final class NewPosterFragment extends BaseMvpFragment<Object> implements ies, nds, View.OnClickListener {
    public j860 T;
    public ViewGroup U;
    public TextView V;
    public NewPosterImageView W;
    public TextView X;
    public ViewGroup Y;
    public View Z;
    public View a0;
    public RecyclerView b0;
    public p860 c0;
    public final a d0 = new a();

    /* compiled from: NewPosterFragment.kt */
    public static final class a implements fux<Integer> {
        public a() {
        }

        @Override // xsna.fux
        public final void li(int i, Object obj) {
            int intValue = ((Number) obj).intValue();
            p860 p860Var = NewPosterFragment.this.c0;
            if (p860Var != null) {
                p860Var.e = intValue;
                p860Var.b.d1(intValue);
            }
        }
    }

    /* compiled from: NewPosterFragment.kt */
    public static final class b implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int b = an10.b((i3 - i) * 0.055555556f);
            if (view != null) {
                view.setPadding(b, view.getPaddingTop(), b, view.getPaddingBottom());
            }
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    public final void d1(int i) {
        TextView textView = this.X;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.c0;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        List list;
        super.onActivityResult(i, i2, intent);
        p860 p860Var = this.c0;
        if (p860Var != null) {
            if (i == 10 || i2 == -1) {
                Uri uri = null;
                if (intent != null && intent.hasExtra("result_attachments")) {
                    Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                    if (bundleExtra == null || (list = bundleExtra.getParcelableArrayList("result_files")) == null) {
                        list = EmptyList.b;
                    }
                    if (!list.isEmpty()) {
                        uri = (Uri) list.get(0);
                    }
                } else if (intent != null) {
                    uri = intent.getData();
                }
                if (uri == null) {
                    return;
                }
                String b2 = r9r.b(p860Var.b.getActivity(), uri);
                if (b2 != null) {
                    p860Var.b(b2);
                }
                ((fhc0.d) p860Var.i.getValue()).b();
                jbc0 jbc0Var = (jbc0) p860Var.h.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final p860 p860Var;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.newposter_placeholder_layout) {
            p860 p860Var2 = this.c0;
            if (p860Var2 != null) {
                p860Var2.g();
                ((fhc0.d) p860Var2.i.getValue()).a();
                jbc0 jbc0Var = (jbc0) p860Var2.h.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.newposter_save_button || (p860Var = this.c0) == null) {
            return;
        }
        if (com.vk.newsfeed.impl.posting.a.e == null) {
            com.vk.newsfeed.impl.posting.a.e = new com.vk.newsfeed.impl.posting.a();
        }
        com.vk.newsfeed.impl.posting.a.e.getClass();
        new b.d("poster_custom_editor_save").e();
        final Bitmap bitmap = p860Var.f;
        if (bitmap == null) {
            return;
        }
        final File s = com.vk.core.files.a.s();
        b0 m = new v(new Callable() { // from class: xsna.m860
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MediaImageEncoder mediaImageEncoder = MediaImageEncoder.INSTANCE;
                Bitmap bitmap2 = bitmap;
                File file = s;
                if (MediaImageEncoder.encodeJpeg$default(mediaImageEncoder, bitmap2, file, 0, 4, null)) {
                    return file;
                }
                throw new IllegalStateException("Can not write bitmap to file");
            }
        }).h(new n3t(new l84(s, 1), 12)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        f fVar = new f() { // from class: xsna.n860
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                String absolutePath = s.getAbsolutePath();
                if (drm0.d0(absolutePath, '/')) {
                    absolutePath = "file://".concat(absolutePath);
                }
                String str = absolutePath;
                p860 p860Var3 = p860.this;
                Bitmap bitmap2 = p860Var3.f;
                int width = bitmap2 != null ? bitmap2.getWidth() : 0;
                Bitmap bitmap3 = p860Var3.f;
                Intent putExtra = new Intent().putExtra("psoterBackground", new NewPosterResult(p860Var3.e, new ImageSize(str, width, bitmap3 != null ? bitmap3.getHeight() : 0, null, (char) 0, false, 56, null)));
                NewPosterFragment newPosterFragment = p860Var3.b;
                newPosterFragment.setResult(-1, putExtra);
                newPosterFragment.finish();
            }
        };
        int i = kwg0.a;
        p860Var.b.Q.b(m.subscribe(fVar, new iwg0()));
        ((fhc0.d) p860Var.i.getValue()).c();
        jbc0 jbc0Var2 = (jbc0) p860Var.h.getValue();
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0Var2.g();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.c0 = new p860(this, arguments, bundle);
        this.T = new j860(this.d0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.new_poster, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_new_poster, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.toolbar);
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        appCompatActivity.setSupportActionBar(toolbar);
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_cancel_outline_28, appCompatActivity);
        if (a2 != null) {
            a2.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_accent_themed), PorterDuff.Mode.SRC_IN);
        } else {
            a2 = null;
        }
        eu supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n(true);
            supportActionBar.r(a2);
        }
        NewPosterImageView newPosterImageView = (NewPosterImageView) viewGroup2.findViewById(R.id.newposter_image_view);
        newPosterImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        newPosterImageView.setRadius(getActivity() != null ? e3m.a(R.dimen.newposter_image_radius, r1) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.W = newPosterImageView;
        View findViewById = viewGroup2.findViewById(R.id.newposter_image_layout);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById;
        aspectRatioFrameLayout.setAspectRatio(1.3333334f);
        float f = 500;
        aspectRatioFrameLayout.setMaxWidth(iah0.a(f));
        aspectRatioFrameLayout.setCheckAvailableAspectRatio(false);
        this.Y = (ViewGroup) findViewById;
        TextView textView = (TextView) viewGroup2.findViewById(R.id.newposter_placeholder_text_view);
        if (getActivity() != null) {
            com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, null, 6);
        }
        this.X = textView;
        View findViewById2 = viewGroup2.findViewById(R.id.newposter_placeholder_layout);
        AspectRatioLinearLayout aspectRatioLinearLayout = (AspectRatioLinearLayout) findViewById2;
        aspectRatioLinearLayout.setAspectRatio(1.3333334f);
        aspectRatioLinearLayout.setMaxWidth(iah0.a(f));
        aspectRatioLinearLayout.setCheckAvailableAspectRatio(false);
        bwt0.h0(this, aspectRatioLinearLayout);
        this.U = (ViewGroup) findViewById2;
        this.V = (TextView) viewGroup2.findViewById(R.id.newposter_result_text);
        View findViewById3 = viewGroup2.findViewById(R.id.newposter_save_button);
        bwt0.h0(this, findViewById3);
        this.Z = findViewById3;
        this.a0 = viewGroup2.findViewById(R.id.newposter_save_button_shadow);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.newposter_colors_recycler_view);
        j860 j860Var = this.T;
        recyclerView.setAdapter(j860Var != null ? j860Var : null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int a3 = iah0.a(16);
        recyclerView.addItemDecoration(new v98(iah0.a(8), a3, a3, true));
        this.b0 = recyclerView;
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            overflowIcon.setTint(dhr0.t.c(R.attr.vk_ui_icon_medium));
            toolbar.setOverflowIcon(overflowIcon);
        }
        return viewGroup2;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.X = null;
        this.Y = null;
        this.W = null;
        this.U = null;
        this.V = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (jjc.e()) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (menuItem.getItemId() != R.id.new_poster_update) {
            return super.onOptionsItemSelected(menuItem);
        }
        p860 p860Var = this.c0;
        if (p860Var == null) {
            return true;
        }
        p860Var.g();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        p860 p860Var = this.c0;
        if (p860Var != null) {
            bundle.putString(V5.c.c, p860Var.g);
            bundle.putInt("textColor", p860Var.e);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = this.X;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new b());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_CREATE_CUSTOM_POSTER;
    }
}
