package ru.ozon.app.android.debugmenu.debugscreen.version;

import AI.a;
import AI.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import com.google.android.material.textfield.TextInputEditText;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.databinding.ActivityVersionBinding;
import ru.ozon.app.android.debugmenu.debugscreen.version.di.DaggerVersionScreenComponent;
import ru.ozon.app.android.debugmenu.debugscreen.version.di.VersionScreenComponent;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/debugmenu/debugscreen/version/VersionActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "", "message", "", "showFlashBar", "(Ljava/lang/String;)V", "getCurrentVersion", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "getAppVersionStorage", "()Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "setAppVersionStorage", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;)V", "Lkotlin/text/Regex;", "regexp", "Lkotlin/text/Regex;", "Lru/ozon/app/android/debugmenu/databinding/ActivityVersionBinding;", "binding", "Lru/ozon/app/android/debugmenu/databinding/ActivityVersionBinding;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VersionActivity extends g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public AppVersionStorage appVersionStorage;
    private ActivityVersionBinding binding;

    @NotNull
    private final Regex regexp = new Regex("^([\\d]+\\.){1,2}\\d+-\\d+");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/debugscreen/version/VersionActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) VersionActivity.class);
        }

        private Companion() {
        }
    }

    private final String getCurrentVersion() {
        String format = String.format(Locale.getDefault(), "%s-%s", Arrays.copyOf(new Object[]{getAppVersionStorage().getVersionName(), getAppVersionStorage().getVersionCode()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(VersionActivity versionActivity, View view) {
        AppVersionStorage appVersionStorage = versionActivity.getAppVersionStorage();
        ActivityVersionBinding activityVersionBinding = versionActivity.binding;
        if (activityVersionBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        appVersionStorage.saveFakeVersion(String.valueOf(activityVersionBinding.appVersionEt.getText()));
        versionActivity.showFlashBar("Версия успешно изменена");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(VersionActivity versionActivity, View view) {
        versionActivity.getAppVersionStorage().clearFakeVersion();
        versionActivity.showFlashBar("Версия выставлена по умолчанию");
        ActivityVersionBinding activityVersionBinding = versionActivity.binding;
        if (activityVersionBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityVersionBinding.appVersionEt.setText(versionActivity.getCurrentVersion());
        ActivityVersionBinding activityVersionBinding2 = versionActivity.binding;
        if (activityVersionBinding2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextInputEditText textInputEditText = activityVersionBinding2.appVersionEt;
        if (activityVersionBinding2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = textInputEditText.getText();
        textInputEditText.setSelection(text != null ? text.length() : 0);
    }

    private final void showFlashBar(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(this);
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, 3000L, null, null, this, 57306, null).show();
        }
    }

    @NotNull
    public final AppVersionStorage getAppVersionStorage() {
        AppVersionStorage appVersionStorage = this.appVersionStorage;
        if (appVersionStorage != null) {
            return appVersionStorage;
        }
        Intrinsics.n("appVersionStorage");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        VersionScreenComponent.Factory factory = DaggerVersionScreenComponent.factory();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        factory.create((StorageComponentApi) dependencyStorage.b(StorageComponentApi.class)).inject(this);
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        ActivityVersionBinding inflate = ActivityVersionBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getConstraintLayout());
        ActivityVersionBinding activityVersionBinding = this.binding;
        if (activityVersionBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setSupportActionBar(activityVersionBinding.toolbar);
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
            supportActionBar.p(ru.ozon.uni.core.R$drawable.ic_m_back);
        }
        ActivityVersionBinding activityVersionBinding2 = this.binding;
        if (activityVersionBinding2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityVersionBinding2.appVersionEt.setText(getCurrentVersion());
        ActivityVersionBinding activityVersionBinding3 = this.binding;
        if (activityVersionBinding3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextInputEditText textInputEditText = activityVersionBinding3.appVersionEt;
        Editable text = textInputEditText.getText();
        textInputEditText.setSelection(text != null ? text.length() : 0);
        ActivityVersionBinding activityVersionBinding4 = this.binding;
        if (activityVersionBinding4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityVersionBinding4.appVersionEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity$onCreate$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable text2) {
                ActivityVersionBinding activityVersionBinding5;
                Regex regex;
                activityVersionBinding5 = VersionActivity.this.binding;
                if (activityVersionBinding5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                Button button = activityVersionBinding5.saveVersionBtn;
                String valueOf = String.valueOf(text2);
                regex = VersionActivity.this.regexp;
                button.setEnabled(regex.f(valueOf));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s11, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s11, "s");
            }
        });
        ActivityVersionBinding activityVersionBinding5 = this.binding;
        if (activityVersionBinding5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityVersionBinding5.saveVersionBtn.setOnClickListener(new a(this, 12));
        ActivityVersionBinding activityVersionBinding6 = this.binding;
        if (activityVersionBinding6 != null) {
            activityVersionBinding6.clearVersionBtn.setOnClickListener(new b(this, 16));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
