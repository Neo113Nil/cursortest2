package ru.ozon.app.android.debugmenu.debugwidgets;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.app.g;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.ComposerPerformanceComponentApi;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.debugmenu.databinding.ActivityDebugWidgetsBinding;
import ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity;
import ru.ozon.app.android.debugmenu.debugwidgets.di.DaggerWidgetsDebugComponent;
import ru.ozon.app.android.debugmenu.debugwidgets.di.WidgetsDebugComponent;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/debugmenu/debugwidgets/WidgetsDebugToolsActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "processIntent", "(Landroid/content/Intent;)Z", "", "fillInitial", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "(Landroid/content/Intent;)V", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "interactor", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "getInteractor", "()Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "setInteractor", "(Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;)V", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "debugToolsStorage", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "getDebugToolsStorage", "()Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "setDebugToolsStorage", "(Lru/ozon/app/android/storage/debug/DebugToolsStorage;)V", "Lru/ozon/app/android/debugmenu/databinding/ActivityDebugWidgetsBinding;", "binding", "Lru/ozon/app/android/debugmenu/databinding/ActivityDebugWidgetsBinding;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetsDebugToolsActivity extends g {
    private ActivityDebugWidgetsBinding binding;
    public DebugToolsStorage debugToolsStorage;
    public WidgetsDebugToolsInteractor interactor;

    private final void fillInitial() {
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding = this.binding;
        if (activityDebugWidgetsBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding.globalSw.setChecked(getDebugToolsStorage().isDebugEnabled());
        activityDebugWidgetsBinding.borderSw.setChecked(getInteractor().isBorderEnabled());
        activityDebugWidgetsBinding.fontSizeEt.setText(String.valueOf(getInteractor().getTextSize()));
        activityDebugWidgetsBinding.fontColorEt.setText(getInteractor().getTextColor());
        activityDebugWidgetsBinding.bubbleColorEt.setText(getInteractor().getBubbleColor());
        activityDebugWidgetsBinding.borderColorEt.setText(getInteractor().getBorderColor());
        activityDebugWidgetsBinding.alphaEt.setText(String.valueOf(getInteractor().getAlpha()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(WidgetsDebugToolsActivity widgetsDebugToolsActivity, CompoundButton compoundButton, boolean z11) {
        widgetsDebugToolsActivity.getDebugToolsStorage().switchDebugEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(WidgetsDebugToolsActivity widgetsDebugToolsActivity, CompoundButton compoundButton, boolean z11) {
        widgetsDebugToolsActivity.getInteractor().switchBordersEnabled(z11);
    }

    private final boolean processIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("action");
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != 1079127060) {
                if (hashCode == 2052130127 && stringExtra.equals("disableWidgetsDebugTools")) {
                    getDebugToolsStorage().switchDebugEnabled(false);
                    Toast.makeText(getApplicationContext(), "Отладка выключена", 0).show();
                    return true;
                }
            } else if (stringExtra.equals("enableWidgetsDebugTools")) {
                getDebugToolsStorage().switchDebugEnabled(true);
                Toast.makeText(getApplicationContext(), "Отладка включена", 0).show();
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DebugToolsStorage getDebugToolsStorage() {
        DebugToolsStorage debugToolsStorage = this.debugToolsStorage;
        if (debugToolsStorage != null) {
            return debugToolsStorage;
        }
        Intrinsics.n("debugToolsStorage");
        throw null;
    }

    @NotNull
    public final WidgetsDebugToolsInteractor getInteractor() {
        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor = this.interactor;
        if (widgetsDebugToolsInteractor != null) {
            return widgetsDebugToolsInteractor;
        }
        Intrinsics.n("interactor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        WidgetsDebugComponent.Factory factory = DaggerWidgetsDebugComponent.factory();
        if (ComposerPerformanceComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerPerformanceComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, ComposerPerformanceComponentApi.class).getDependencyStorage();
        if (ComposerPerformanceComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerPerformanceComponentApi is not DiComponent");
        }
        ComposerPerformanceComponentApi composerPerformanceComponentApi = (ComposerPerformanceComponentApi) dependencyStorage.b(ComposerPerformanceComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        factory.create(composerPerformanceComponentApi, (StorageComponentApi) dependencyStorage2.b(StorageComponentApi.class)).inject(this);
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (processIntent(intent)) {
            finish();
            return;
        }
        ActivityDebugWidgetsBinding inflate = ActivityDebugWidgetsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getRoot());
        fillInitial();
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding = this.binding;
        if (activityDebugWidgetsBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding.globalSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qs.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                WidgetsDebugToolsActivity.onCreate$lambda$0(WidgetsDebugToolsActivity.this, compoundButton, z11);
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding2 = this.binding;
        if (activityDebugWidgetsBinding2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding2.borderSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qs.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                WidgetsDebugToolsActivity.onCreate$lambda$1(WidgetsDebugToolsActivity.this, compoundButton, z11);
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding3 = this.binding;
        if (activityDebugWidgetsBinding3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding3.fontSizeEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity$onCreate$3
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                WidgetsDebugToolsActivity.this.getInteractor().setTextSize(s11.toString());
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding4 = this.binding;
        if (activityDebugWidgetsBinding4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding4.fontColorEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity$onCreate$4
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                WidgetsDebugToolsActivity.this.getInteractor().setTextColor(WidgetsDebugToolsActivity.this, s11.toString());
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding5 = this.binding;
        if (activityDebugWidgetsBinding5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding5.bubbleColorEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity$onCreate$5
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                WidgetsDebugToolsActivity.this.getInteractor().setBubbleColor(WidgetsDebugToolsActivity.this, s11.toString());
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding6 = this.binding;
        if (activityDebugWidgetsBinding6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityDebugWidgetsBinding6.borderColorEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity$onCreate$6
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                WidgetsDebugToolsActivity.this.getInteractor().setBorderColor(WidgetsDebugToolsActivity.this, s11.toString());
            }
        });
        ActivityDebugWidgetsBinding activityDebugWidgetsBinding7 = this.binding;
        if (activityDebugWidgetsBinding7 != null) {
            activityDebugWidgetsBinding7.alphaEt.addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.debugmenu.debugwidgets.WidgetsDebugToolsActivity$onCreate$7
                @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
                public void afterTextChanged(Editable s11) {
                    Intrinsics.checkNotNullParameter(s11, "s");
                    WidgetsDebugToolsInteractor interactor = WidgetsDebugToolsActivity.this.getInteractor();
                    Integer w02 = h.w0(s11.toString());
                    interactor.setAlpha(w02 != null ? w02.intValue() : 190);
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        processIntent(intent);
    }
}
