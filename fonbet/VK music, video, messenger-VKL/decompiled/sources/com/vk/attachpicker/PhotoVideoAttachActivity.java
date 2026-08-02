package com.vk.attachpicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.a;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.l;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.attachpicker.widget.TopShadowLinearLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.preview.di.GalleryPickerPreviewComponent;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.preview.presentation.view.GalleryPickerPreview;
import com.vk.pushes.PushAwareActivity;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$ContentType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.b5t;
import xsna.bd70;
import xsna.biq;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bx80;
import xsna.cuz;
import xsna.dbg0;
import xsna.dhr0;
import xsna.dm10;
import xsna.ewt0;
import xsna.f4m;
import xsna.f5x;
import xsna.gmj;
import xsna.gz80;
import xsna.h2d0;
import xsna.h7u0;
import xsna.i440;
import xsna.io60;
import xsna.iut0;
import xsna.iz3;
import xsna.j34;
import xsna.j6i;
import xsna.j8p;
import xsna.l7s;
import xsna.m0q0;
import xsna.m7m;
import xsna.m960;
import xsna.o4t;
import xsna.oh3;
import xsna.p870;
import xsna.pda0;
import xsna.pi0;
import xsna.pj8;
import xsna.ps2;
import xsna.qaa0;
import xsna.qcy;
import xsna.qda0;
import xsna.qm90;
import xsna.r34;
import xsna.rda0;
import xsna.rly;
import xsna.rok;
import xsna.rwi;
import xsna.sok;
import xsna.ss3;
import xsna.sw50;
import xsna.t4t;
import xsna.t970;
import xsna.tok;
import xsna.v16;
import xsna.w16;
import xsna.w4t;
import xsna.x16;
import xsna.xy0;
import xsna.yg7;
import xsna.yv2;
import xsna.zb60;
import xsna.zmp0;

/* loaded from: classes15.dex */
public class PhotoVideoAttachActivity extends PushAwareActivity implements b.InterfaceC0381b, j34, m0q0, rok, h2d0 {
    public static final /* synthetic */ int g0 = 0;
    public boolean A;
    public int C;
    public String D;
    public ArrayList<String> E;
    public ArrayList<String> F;
    public boolean G;
    public long I;
    public long J;
    public VkButton K;
    public View L;
    public VkButton M;
    public View N;
    public ViewGroup O;
    public View P;
    public View Q;
    public ViewGroup R;
    public ViewGroup S;
    public View T;
    public View U;
    public b5t V;

    @Nullable
    public GalleryPickerSourceConfiguration W;

    @Nullable
    public GalleryPickerInitialData X;

    @Nullable
    public StoryCameraParams Y;

    @Nullable
    public gmj Z;
    public qaa0 a0;

    @Nullable
    public com.vk.attachpicker.a c0;
    public final a e0;
    public final b f0;
    public boolean x;
    public boolean y;
    public boolean z;
    public final c v = new c();
    public final sok w = new sok(this);
    public UserId B = UserId.d;
    public int H = 0;
    public LayoutInflater b0 = null;
    public int d0 = 0;

    public class a implements bd70<Void> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Void r5) {
            PhotoVideoAttachActivity photoVideoAttachActivity = PhotoVideoAttachActivity.this;
            KeyEvent.Callback callback = photoVideoAttachActivity.Q;
            c cVar = photoVideoAttachActivity.v;
            if (callback instanceof GalleryPickerPreview) {
                ((GalleryPickerPreview) callback).z4(new ArrayList(cVar.b()));
                View view = photoVideoAttachActivity.Q;
                f5x f5xVar = new f5x(photoVideoAttachActivity, 26);
                qcy<Object>[] qcyVarArr = bwt0.a;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view.isLaidOut()) {
                    f5xVar.invoke();
                } else {
                    view.addOnLayoutChangeListener(new ewt0(f5xVar));
                }
            }
            int size = cVar.e.size();
            photoVideoAttachActivity.K.setCount(Integer.valueOf(size > 0 ? size : 1));
            VkButton vkButton = photoVideoAttachActivity.M;
            if (vkButton != null) {
                vkButton.setCount(Integer.valueOf(size > 0 ? size : 1));
            }
            photoVideoAttachActivity.T1(size > 0);
            photoVideoAttachActivity.U1(size <= 0, true);
            qaa0 qaa0Var = photoVideoAttachActivity.a0;
            if (qaa0Var != null) {
                GalleryPickerSourceConfiguration.EntryPoint entryPoint = qaa0Var.b;
                if ((entryPoint == GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW || entryPoint == GalleryPickerSourceConfiguration.EntryPoint.ALBUM) && !qaa0Var.c) {
                    qaa0Var.a.c((entryPoint == null ? -1 : qaa0.a.$EnumSwitchMapping$0[entryPoint.ordinal()]) == 1 ? MobileOfficialAppsConPhotosStat$ContentType.PHOTO : MobileOfficialAppsConPhotosStat$ContentType.ALBUM);
                    qaa0Var.c = true;
                }
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle bundleExtra;
            ArrayList parcelableArrayList;
            int i;
            String dataString = intent.getDataString();
            if ((dataString == null || dataString.length() == 0) && ((bundleExtra = intent.getBundleExtra("result_attachments")) == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null || !(!parcelableArrayList.isEmpty()))) {
                return;
            }
            boolean isEmpty = TextUtils.isEmpty(intent.getDataString());
            PhotoVideoAttachActivity photoVideoAttachActivity = PhotoVideoAttachActivity.this;
            if (isEmpty && photoVideoAttachActivity.H == 702) {
                Bundle bundleExtra2 = intent.getBundleExtra("result_attachments");
                Uri uri = null;
                if (bundleExtra2 != null) {
                    ArrayList parcelableArrayList2 = bundleExtra2.getParcelableArrayList("result_files");
                    boolean[] booleanArray = bundleExtra2.getBooleanArray("result_video_flags");
                    if (parcelableArrayList2 != null && booleanArray != null) {
                        if (booleanArray.length > 0) {
                            i = 0;
                            boolean z = booleanArray[0];
                        } else {
                            i = -1;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        if (i == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            uri = (Uri) parcelableArrayList2.get(valueOf.intValue());
                        }
                    }
                }
                intent.setData(uri);
                photoVideoAttachActivity.V2(intent);
            }
            photoVideoAttachActivity.V2(intent);
        }
    }

    public PhotoVideoAttachActivity() {
        new io.reactivex.rxjava3.disposables.b();
        this.e0 = new a();
        this.f0 = new b();
    }

    @Override // xsna.rok
    @Nullable
    public final tok R() {
        return this.w;
    }

    public final void T1(boolean z) {
        com.vk.attachpicker.a aVar;
        boolean f;
        b5t b5tVar;
        b5t b5tVar2 = this.V;
        if (b5tVar2 != null && bwt0.K(this.O) != (f = b5tVar2.f(z))) {
            bwt0.p0(this.O, f);
            GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) n().f(R.id.fl_container);
            if (galleryFragmentImpl != null && (b5tVar = this.V) != null) {
                int c = b5tVar.c(this, z);
                GalleryRecyclerView galleryRecyclerView = galleryFragmentImpl.a0;
                if (galleryRecyclerView != null) {
                    galleryFragmentImpl.mo(galleryRecyclerView, c);
                }
                FastScroller fastScroller = galleryFragmentImpl.v0;
                if (fastScroller != null) {
                    f4m.q(c, fastScroller);
                }
            }
        }
        if (z || (aVar = this.c0) == null) {
            return;
        }
        aVar.c(false);
    }

    public final void U1(boolean z, boolean z2) {
        if (z2) {
            biq biqVar = new biq();
            biqVar.setDuration(200L);
            zmp0.a(this.O, biqVar);
        }
        if (z) {
            this.N.setVisibility(0);
            this.K.setVisibility(8);
        } else {
            this.N.setVisibility(8);
            this.K.setVisibility(0);
        }
    }

    public final void V1() {
        c cVar = this.v;
        if (r34.a(this, cVar.b(), this.I, this.J)) {
            qaa0 qaa0Var = this.a0;
            if (qaa0Var != null) {
                int size = cVar.e.size();
                GalleryPickerSourceConfiguration.EntryPoint entryPoint = qaa0Var.b;
                if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW || entryPoint == GalleryPickerSourceConfiguration.EntryPoint.ALBUM) {
                    qaa0Var.a.a(size);
                }
            }
            V2(cVar.w());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.j34
    public final void V2(Intent intent) {
        Uri n;
        o4t o4tVar;
        int i;
        int i2 = 0;
        if (intent == null) {
            setResult(0);
            finish();
            return;
        }
        if (intent.getBooleanExtra("story_template_finish", false)) {
            setResult(-1);
            finish();
            return;
        }
        ArrayList<String> arrayList = this.E;
        CharSequence[] charSequenceArr = null;
        if (((arrayList == null || this.x) ? 0 : arrayList.size()) <= 0) {
            if (!this.y || !this.z) {
                com.vk.attachpicker.b.n(intent);
                setResult(-1, intent);
                finish();
                return;
            }
            FragmentImpl f = n().f(R.id.fl_container);
            if ((f instanceof GalleryFragmentImpl) && (o4tVar = ((GalleryFragmentImpl) f).g0) != null) {
                p pVar = o4tVar.m;
                if (pVar != null) {
                    pVar.m();
                }
                l lVar = o4tVar.n;
                if (lVar != null) {
                    lVar.m();
                }
            }
            String dataString = intent.getDataString();
            if (TextUtils.isEmpty(dataString) && (n = com.vk.attachpicker.b.n(intent)) != null) {
                dataString = n.toString();
            }
            if (TextUtils.isEmpty(dataString)) {
                return;
            }
            bpn0 bpn0Var = rwi.d;
            ((sw50) (bpn0Var != null ? bpn0Var : null).getValue()).h().e(this, 10987, this.A, new qm90(2, this, dataString));
            return;
        }
        ArrayList<String> arrayList2 = this.E;
        c cVar = this.v;
        if (arrayList2 != null || this.F != null) {
            Object[] objArr = (arrayList2 == null || this.x) ? false : true;
            Object[] objArr2 = this.F != null && (this.x || cVar.e.size() <= 1);
            int size = (objArr != false ? this.E.size() : 0) + (objArr2 != false ? this.F.size() : 0);
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            if (size != 0) {
                if (objArr == true) {
                    int i3 = 0;
                    i = 0;
                    while (i3 < this.E.size()) {
                        charSequenceArr2[i] = this.E.get(i3);
                        i3++;
                        i++;
                    }
                } else {
                    i = 0;
                }
                if (objArr2 != false) {
                    while (i2 < this.F.size()) {
                        charSequenceArr2[i] = this.F.get(i2);
                        i2++;
                        i++;
                    }
                }
            }
            charSequenceArr = charSequenceArr2;
        }
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            finishActivity(-1);
            return;
        }
        h7u0.a aVar = new h7u0.a(this);
        aVar.h0(getResources().getQuantityString(R.plurals.picker_share_photo_plural, cVar.e.size()));
        aVar.T(charSequenceArr, new qda0(this, intent, 0));
        aVar.create().show();
    }

    @Override // com.vk.attachpicker.b.InterfaceC0381b
    public final com.vk.attachpicker.b Yd() {
        return this.v;
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @Nullable
    public final Object getSystemService(@NonNull String str) {
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.W;
        if (galleryPickerSourceConfiguration == null || !((galleryPickerSourceConfiguration.e || galleryPickerSourceConfiguration.f || galleryPickerSourceConfiguration.g) && "layout_inflater".equals(str))) {
            return super.getSystemService(str);
        }
        if (this.b0 == null) {
            LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
            dhr0.a.getClass();
            this.b0 = layoutInflater.cloneInContext(new l7s(this, dhr0.u().c));
        }
        return this.b0;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 4527) {
            finish();
        }
        if (i == 10987) {
            setResult(-1, intent);
            finish();
        }
        if (i == 10666) {
            FragmentImpl f = n().f(R.id.fl_container);
            if (f instanceof GalleryFragmentImpl) {
                ((GalleryFragmentImpl) f).onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        com.vk.attachpicker.a aVar = this.c0;
        if (aVar != null && aVar.f) {
            aVar.c(false);
            return;
        }
        c cVar = this.v;
        if (cVar == null || cVar.e.size() <= 0) {
            super.onBackPressed();
        } else {
            cVar.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04ee  */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        c cVar;
        GalleryFragmentImpl galleryFragmentImpl;
        ViewGroup Wj;
        VkButton vkButton;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration;
        boolean z;
        WebStoryBox webStoryBox;
        WebStoryBox webStoryBox2;
        setTheme(dhr0.L() ? R.style.PickerPhotoVideoActivity : R.style.PickerPhotoVideoActivityDark);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("prevent_styling", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("prevent_styling_photo", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("prevent_styling_video", false);
        this.I = getIntent().getLongExtra("video_min_length_ms", 0L);
        this.J = getIntent().getLongExtra("video_max_length_ms", 0L);
        long longExtra = getIntent().getLongExtra("story_trim_end_position", 0L);
        String stringExtra = getIntent().getStringExtra("static_header_title");
        boolean booleanExtra4 = getIntent().getBooleanExtra("big_previews", false);
        this.x = getIntent().getBooleanExtra("single_mode", false);
        boolean booleanExtra5 = getIntent().getBooleanExtra("camera_enabled", true);
        boolean booleanExtra6 = getIntent().getBooleanExtra("inner_camera_enabled", false);
        this.C = getIntent().getIntExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        this.y = getIntent().getBooleanExtra("force_thumb", false);
        this.z = getIntent().getBooleanExtra("new_thumb_flow", false);
        this.B = getIntent().hasExtra("thumb_uid") ? (UserId) getIntent().getParcelableExtra("thumb_uid") : UserId.d;
        this.A = getIntent().getBooleanExtra("skip_avatar_publish", false);
        getIntent().getIntExtra("subtitle_res", 0);
        MediaFilteringStrategy mediaFilteringStrategy = (MediaFilteringStrategy) getIntent().getSerializableExtra("video_filtering_mode");
        this.H = getIntent().getIntExtra("request_code", 0);
        this.E = getIntent().hasExtra("complete_options") ? getIntent().getStringArrayListExtra("complete_options") : null;
        this.F = getIntent().hasExtra("complete_options_single") ? getIntent().getStringArrayListExtra("complete_options_single") : null;
        this.Y = (StoryCameraParams) getIntent().getParcelableExtra("camera_params");
        boolean booleanExtra7 = getIntent().getBooleanExtra("long_previews", false);
        boolean booleanExtra8 = getIntent().getBooleanExtra("short_divider", false);
        boolean booleanExtra9 = getIntent().getBooleanExtra("qr_detection", false);
        boolean booleanExtra10 = getIntent().getBooleanExtra("qr_result", false);
        int intExtra = getIntent().getIntExtra("contentDuration", 0);
        boolean booleanExtra11 = getIntent().getBooleanExtra("is_fullhd", false);
        this.D = getIntent().getStringExtra("username");
        boolean booleanExtra12 = getIntent().getBooleanExtra("show_story_camera", false);
        this.G = getIntent().getBooleanExtra("clips_picker", false);
        boolean booleanExtra13 = getIntent().getBooleanExtra("short_previews", false);
        ImageSizeLimits imageSizeLimits = (ImageSizeLimits) getIntent().getParcelableExtra("image_size_limits");
        ImageFormatRestrictions imageFormatRestrictions = (ImageFormatRestrictions) getIntent().getParcelableExtra("image_format_restrictions");
        this.W = getIntent().hasExtra("gallery_picker_source_configuration") ? (GalleryPickerSourceConfiguration) getIntent().getParcelableExtra("gallery_picker_source_configuration") : new GalleryPickerSourceConfiguration();
        this.X = getIntent().hasExtra("initial_data") ? (GalleryPickerInitialData) getIntent().getParcelableExtra("initial_data") : null;
        if (this.x) {
            str = "initial_data";
            str2 = "short_previews";
            i = 1;
        } else {
            str = "initial_data";
            str2 = "short_previews";
            i = getIntent().getIntExtra("total_selection_limit", 10);
        }
        Integer valueOf = Integer.valueOf(i);
        c cVar2 = this.v;
        cVar2.b = valueOf;
        cVar2.a = getIntent().getIntExtra("selection_limit", 10);
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration2 = this.W;
        if (galleryPickerSourceConfiguration2 != null && (galleryPickerSourceConfiguration2.e || galleryPickerSourceConfiguration2.f || galleryPickerSourceConfiguration2.g)) {
            dhr0.a.getClass();
            setTheme(dhr0.u().c);
        }
        setContentView(R.layout.picker_activity_photo_video_attach);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_container);
        ((TopShadowLinearLayout) findViewById(R.id.top_shadow)).setShadowEnabled(!this.W.e);
        this.K = (VkButton) findViewById(R.id.acv_bottom_panel_counter);
        this.L = findViewById(R.id.second_step_cancel);
        this.M = (VkButton) findViewById(R.id.second_step_continue);
        this.N = findViewById(R.id.tv_bottom_panel_cancel);
        this.O = (ViewGroup) findViewById(R.id.fl_bottom_button);
        this.P = findViewById(R.id.bottom_button_shadow);
        this.R = (ViewGroup) findViewById(R.id.first_step_button_container);
        this.S = (ViewGroup) findViewById(R.id.second_step_button_container);
        this.T = findViewById(R.id.content_overlay_view);
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration3 = this.W;
        if (galleryPickerSourceConfiguration3 == null || !galleryPickerSourceConfiguration3.e) {
            U1(true, false);
        } else {
            U1(false, false);
        }
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration4 = this.W;
        if (galleryPickerSourceConfiguration4 == null || galleryPickerSourceConfiguration4.e || galleryPickerSourceConfiguration4.f || galleryPickerSourceConfiguration4.g) {
            getWindow().addFlags(Integer.MIN_VALUE);
            dhr0.a.getClass();
            cVar = cVar2;
            int b2 = dm10.b(R.attr.vk_ui_background_content, -16777216, dhr0.s());
            this.d0 = b2;
            getWindow().setStatusBarColor(b2);
            dhr0.u0(getWindow(), NavigationBarStyle.DARK);
        } else {
            if (gz80.a(23) && dhr0.L()) {
                frameLayout.setSystemUiVisibility(frameLayout.getSystemUiVisibility() + 8192);
                int c = dhr0.t.c(R.attr.vk_ui_background_modal);
                this.d0 = c;
                getWindow().setStatusBarColor(c);
            }
            dhr0.r0(this);
            cVar = cVar2;
        }
        this.K.setOnClickListener(new pj8(this, 7));
        this.N.setOnClickListener(new x16(this, 14));
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("prevent_styling", booleanExtra);
        bundle2.putBoolean("prevent_styling_photo", booleanExtra2);
        bundle2.putBoolean("prevent_styling_video", booleanExtra3);
        bundle2.putLong("video_min_length_ms", this.I);
        bundle2.putLong("video_max_length_ms", this.J);
        bundle2.putLong("story_trim_end_position", longExtra);
        bundle2.putString("static_header_title", stringExtra);
        bundle2.putBoolean("big_previews", booleanExtra4);
        bundle2.putBoolean("single_mode", this.x);
        bundle2.putBoolean("camera_enabled", booleanExtra5);
        bundle2.putInt("media_type", this.C);
        bundle2.putBoolean("force_thumb", this.y);
        bundle2.putBoolean("inner_camera_enabled", booleanExtra6);
        bundle2.putBoolean("long_previews", booleanExtra7);
        bundle2.putBoolean("short_divider", booleanExtra8);
        bundle2.putBoolean("qr_detection", booleanExtra9);
        bundle2.putBoolean("qr_result", booleanExtra10);
        bundle2.putInt("contentDuration", intExtra);
        bundle2.putSerializable("video_filtering_mode", mediaFilteringStrategy != null ? mediaFilteringStrategy : MediaFilteringStrategy.NONE);
        bundle2.putBoolean("is_fullhd", booleanExtra11);
        bundle2.putBoolean("new_thumb_flow", this.z);
        bundle2.putBoolean("show_story_camera", booleanExtra12);
        bundle2.putBoolean(str2, booleanExtra13);
        bundle2.putParcelable("image_size_limits", imageSizeLimits);
        bundle2.putParcelable("image_format_restrictions", imageFormatRestrictions);
        bundle2.putParcelable("gallery_picker_source_configuration", this.W);
        bundle2.putParcelable(str, this.X);
        try {
            GalleryFragmentImpl galleryFragmentImpl2 = (GalleryFragmentImpl) n().f(R.id.fl_container);
            if (galleryFragmentImpl2 == null) {
                try {
                    galleryFragmentImpl = new GalleryFragmentImpl();
                } catch (Exception e) {
                    e = e;
                    galleryFragmentImpl = galleryFragmentImpl2;
                }
                try {
                    galleryFragmentImpl.setArguments(bundle2);
                    n().q().c(R.id.fl_container, galleryFragmentImpl);
                } catch (Exception e2) {
                    e = e2;
                    L.j(e, "PhotoVideoAttachActivity");
                    galleryFragmentImpl.R = t4t.a(galleryFragmentImpl.R, stringExtra, -65);
                    Wj = galleryFragmentImpl.Wj(this);
                    frameLayout.addView(Wj);
                    View view = new View(this);
                    this.U = view;
                    view.setBackgroundColor(-16777216);
                    this.U.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    if (Wj != null) {
                    }
                    b5t b5tVar = galleryFragmentImpl.q0;
                    this.V = b5tVar;
                    this.a0 = galleryFragmentImpl.O;
                    this.K.setText(b5tVar.j(this));
                    vkButton = this.M;
                    if (vkButton != null) {
                    }
                    galleryPickerSourceConfiguration = this.W;
                    if (galleryPickerSourceConfiguration != null) {
                    }
                    z = false;
                    T1(z);
                    p870.f().b(1, this.e0);
                    cuz.a(this).b(this.f0, new IntentFilter("noPermissionsPickerAttachments"));
                }
            } else {
                galleryFragmentImpl = galleryFragmentImpl2;
            }
        } catch (Exception e3) {
            e = e3;
            galleryFragmentImpl = null;
        }
        galleryFragmentImpl.R = t4t.a(galleryFragmentImpl.R, stringExtra, -65);
        Wj = galleryFragmentImpl.Wj(this);
        frameLayout.addView(Wj);
        View view2 = new View(this);
        this.U = view2;
        view2.setBackgroundColor(-16777216);
        this.U.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (Wj != null) {
            bwt0.S(Wj, new oh3(25, this, frameLayout));
            Wj.addOnLayoutChangeListener(new j8p(1, Wj, new xy0(17, this, (LinearLayout) Wj)));
        }
        b5t b5tVar2 = galleryFragmentImpl.q0;
        this.V = b5tVar2;
        this.a0 = galleryFragmentImpl.O;
        this.K.setText(b5tVar2.j(this));
        vkButton = this.M;
        if (vkButton != null) {
            vkButton.setText(getString(R.string.picker_upload));
        }
        galleryPickerSourceConfiguration = this.W;
        if (galleryPickerSourceConfiguration != null) {
            int i2 = 29;
            int i3 = 8;
            if (galleryPickerSourceConfiguration.b) {
                if (galleryPickerSourceConfiguration.c) {
                    this.P.setVisibility(8);
                    this.S.setVisibility(0);
                    ViewGroup viewGroup = this.O;
                    Resources resources = getResources();
                    Resources.Theme theme = getTheme();
                    ThreadLocal<TypedValue> threadLocal = dbg0.a;
                    viewGroup.setBackground(resources.getDrawable(R.drawable.bg_picker_preview, theme));
                    rly k5 = ((GalleryPickerPreviewComponent) j6i.c(m7m.f(this), GalleryPickerPreviewComponent.class)).k5();
                    this.c0 = new com.vk.attachpicker.a(new a.b(this.U, this.T, this.L, this.M, this.R, this.S), new v16(this, 6), new w16(this, 10), getWindow(), this.d0);
                    Objects.requireNonNull(cVar);
                    com.vk.preview.presentation.view.c a2 = k5.a(this, new zb60(cVar, 7), this.c0);
                    this.Q = a2;
                    a2.setPreviewListener(new rda0(this));
                    this.O.addView(this.Q, 0);
                    com.vk.attachpicker.a aVar = this.c0;
                    a.b bVar = aVar.a;
                    bVar.e.setAlpha(1 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    bVar.f.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    aVar.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.c0.c(false);
                } else {
                    this.P.setVisibility(8);
                    this.S.setVisibility(8);
                    View a3 = ((GalleryPickerPreviewComponent) j6i.c(m7m.f(this), GalleryPickerPreviewComponent.class)).f7().a(this, null, null, false, null);
                    this.Q = a3;
                    ((GalleryPickerPreview) a3).setPreviewListener(new pi0(this, i2));
                    this.O.addView(this.Q, 0);
                }
            }
            if (this.W.e) {
                this.P.setVisibility(8);
                w4t w6 = ((GalleryPickerPreviewComponent) j6i.c(m7m.f(this), GalleryPickerPreviewComponent.class)).w6();
                ss3 ss3Var = new ss3(18, this, galleryFragmentImpl);
                m960 m960Var = new m960(this, i3);
                StoryCameraParams storyCameraParams = this.Y;
                this.Q = w6.a(this, ss3Var, m960Var, (storyCameraParams == null || (webStoryBox2 = storyCameraParams.u) == null) ? false : webStoryBox2.Db(), new yg7(galleryFragmentImpl, 10));
                StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
                storiesFeatures.getClass();
                if (com.vk.toggle.b.A.a(storiesFeatures)) {
                    bwt0.R(this.Q, new pda0(0, this, galleryFragmentImpl));
                }
                KeyEvent.Callback callback = this.Q;
                if (callback instanceof GalleryPickerPreview) {
                    ((GalleryPickerPreview) callback).setPreviewListener(new bx80(this, 2));
                }
                this.O.removeAllViews();
                this.O.addView(this.Q, 0);
            }
            if (this.W.f) {
                this.P.setVisibility(8);
                w4t ne = ((GalleryPickerPreviewComponent) j6i.c(m7m.f(this), GalleryPickerPreviewComponent.class)).ne();
                i440 i440Var = new i440(this, 11);
                yv2 yv2Var = new yv2(26);
                StoryCameraParams storyCameraParams2 = this.Y;
                View a4 = ne.a(this, i440Var, yv2Var, (storyCameraParams2 == null || (webStoryBox = storyCameraParams2.u) == null) ? false : webStoryBox.Db(), null);
                this.Q = a4;
                ((GalleryPickerPreview) a4).setPreviewListener(new ps2(this, i2));
                ((GalleryPickerPreview) this.Q).setInitialState(this.X);
                this.O.removeAllViews();
                z = false;
                this.O.addView(this.Q, 0);
                T1(z);
                p870.f().b(1, this.e0);
                cuz.a(this).b(this.f0, new IntentFilter("noPermissionsPickerAttachments"));
            }
        }
        z = false;
        T1(z);
        p870.f().b(1, this.e0);
        cuz.a(this).b(this.f0, new IntentFilter("noPermissionsPickerAttachments"));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p870.f().g(this.e0);
        cuz.a(this).d(this.f0);
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.W;
        if (galleryPickerSourceConfiguration == null || !galleryPickerSourceConfiguration.e) {
            return;
        }
        GalleryPickerPreview.State state = (GalleryPickerPreview.State) getIntent().getParcelableExtra("PREVIEW_STATE");
        if (state != null) {
            KeyEvent.Callback callback = this.Q;
            if (callback instanceof GalleryPickerPreview) {
                ((GalleryPickerPreview) callback).s3(state);
            }
        }
        io60 io60Var = new io60(this, 9);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("PRESELECTED_FILES");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            FragmentImpl f = n().f(R.id.fl_container);
            if (f instanceof GalleryFragmentImpl) {
                ((GalleryFragmentImpl) f).R3(new HashMap(), new t970(3));
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap(parcelableArrayListExtra.size());
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            hashMap.put(((Uri) it.next()).getLastPathSegment(), null);
        }
        FragmentImpl f2 = n().f(R.id.fl_container);
        if (f2 instanceof GalleryFragmentImpl) {
            ((GalleryFragmentImpl) f2).R3(hashMap, io60Var);
        }
    }

    @Override // xsna.h2d0
    public final void qm(@NonNull HashMap hashMap) {
        FragmentImpl f = n().f(R.id.fl_container);
        if (f instanceof GalleryFragmentImpl) {
            ((GalleryFragmentImpl) f).R3(hashMap, new iz3(20));
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (this.G) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MEDIA_PICKER;
            return;
        }
        int i = this.C;
        if (i == 111) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_VIDEO_PICKER;
        } else if (i != 333) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_PICKER;
        } else {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_PICKER;
        }
    }
}
