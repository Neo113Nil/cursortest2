package ru.ozon.app.android.abtool.presentation;

import Ax.ViewOnClickListenerC2451a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$style;
import ru.ozon.app.android.abtool.databinding.ActivityAbToggleBinding;
import ru.ozon.app.android.abtool.presentation.debug.AbDebugFragment;
import ru.ozon.app.android.abtool.presentation.debug.ActionType;
import ru.ozon.app.android.abtool.presentation.root.RootFragment;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToggleActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "", "setContentView", "initToolbar", "", "screenType", "initFragment", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/abtool/databinding/ActivityAbToggleBinding;", "binding", "Lru/ozon/app/android/abtool/databinding/ActivityAbToggleBinding;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleActivity extends g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AbToggleScreenType DEFAULT_SCREEN_TYPE = AbToggleScreenType.FEATURES;
    private ActivityAbToggleBinding binding;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToggleActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "screenType", "", "variants", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "flags", "", "startActivity", "(Landroid/content/Context;Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;Ljava/lang/String;Lru/ozon/app/android/abtool/presentation/debug/ActionType;Ljava/lang/Integer;)V", "DEFAULT_SCREEN_TYPE", "Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "getDEFAULT_SCREEN_TYPE$abzone_release", "()Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "EXTRA_SCREEN_TYPE", "Ljava/lang/String;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startActivity$default(Companion companion, Context context, AbToggleScreenType abToggleScreenType, String str, ActionType actionType, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                abToggleScreenType = companion.getDEFAULT_SCREEN_TYPE$abzone_release();
            }
            companion.startActivity(context, abToggleScreenType, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : actionType, (i11 & 16) != 0 ? null : num);
        }

        @NotNull
        public final AbToggleScreenType getDEFAULT_SCREEN_TYPE$abzone_release() {
            return AbToggleActivity.DEFAULT_SCREEN_TYPE;
        }

        public final void startActivity(@NotNull Context context, @NotNull AbToggleScreenType screenType, String variants, ActionType actionType, Integer flags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intent putExtra = new Intent(context, (Class<?>) AbToggleActivity.class).putExtra("EXTRA_SCREEN_TYPE", screenType.name()).putExtra("extra_variants", variants).putExtra("extra_action_type", actionType != null ? Integer.valueOf(actionType.ordinal()) : null);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            if (flags != null) {
                putExtra.addFlags(flags.intValue());
            }
            context.startActivity(putExtra);
        }

        private Companion() {
        }
    }

    private final void initFragment(String screenType) {
        ComponentCallbacksC5392m newInstance;
        int hashCode = screenType.hashCode();
        if (hashCode != -1451053931) {
            if (hashCode != -492488714) {
                if (hashCode != 491967549 || !screenType.equals("FEATURES")) {
                    return;
                } else {
                    newInstance = RootFragment.INSTANCE.newInstance(AbToggleScreenType.FEATURES);
                }
            } else if (!screenType.equals("EXPERIMENTS")) {
                return;
            } else {
                newInstance = RootFragment.INSTANCE.newInstance(AbToggleScreenType.EXPERIMENTS);
            }
        } else {
            if (!screenType.equals("AB_DEBUG")) {
                return;
            }
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString("extra_variants", "") : null;
            String str = string != null ? string : "";
            Bundle extras2 = getIntent().getExtras();
            newInstance = AbDebugFragment.INSTANCE.newInstance(str, extras2 != null ? extras2.getInt("extra_action_type", AbDebugFragment.INSTANCE.getDEFAULT_ACTION_TYPE$abzone_release().ordinal()) : AbDebugFragment.INSTANCE.getDEFAULT_ACTION_TYPE$abzone_release().ordinal());
        }
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Q p11 = supportFragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        ComponentCallbacksC5392m g02 = getSupportFragmentManager().g0(screenType);
        if (g02 != null) {
            p11.y(g02);
        } else {
            p11.r(R$id.container, newInstance, screenType);
        }
        p11.i();
    }

    private final void initToolbar() {
        ActivityAbToggleBinding activityAbToggleBinding = this.binding;
        if (activityAbToggleBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setSupportActionBar(activityAbToggleBinding.toolbar);
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
        }
        ActivityAbToggleBinding activityAbToggleBinding2 = this.binding;
        if (activityAbToggleBinding2 != null) {
            activityAbToggleBinding2.toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2451a(this, 6));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$1(AbToggleActivity abToggleActivity, View view) {
        abToggleActivity.getOnBackPressedDispatcher().l();
    }

    private final void setContentView() {
        ActivityAbToggleBinding inflate = ActivityAbToggleBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        LinearLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setContentView(root);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String name;
        setTheme(R$style.Theme_AppCompat_DayNight_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView();
        initToolbar();
        Bundle extras = getIntent().getExtras();
        if (extras == null || (name = extras.getString("EXTRA_SCREEN_TYPE", DEFAULT_SCREEN_TYPE.name())) == null) {
            name = DEFAULT_SCREEN_TYPE.name();
        }
        initFragment(name);
    }
}
