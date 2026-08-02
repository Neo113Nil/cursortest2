package ru.ozon.app.android.debugmenu.servicemesh;

import Dc0.n;
import Sc.o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.appcompat.app.g;
import cU.d;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.data.AbVariantService;
import ru.ozon.app.android.debugmenu.data.DebugToolAction;
import ru.ozon.app.android.debugmenu.databinding.ServiceMeshSuccessActivityBinding;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity;
import ru.ozon.app.android.debugmenu.servicemesh.di.DaggerDebugToolsComponent;
import ru.ozon.app.android.debugmenu.servicemesh.di.DebugToolsComponent;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.R$style;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/debugmenu/servicemesh/DebugToolsActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Lru/ozon/app/android/debugmenu/data/DebugToolAction;", "action", "", "handleAction", "(Lru/ozon/app/android/debugmenu/data/DebugToolAction;)V", "updateDebugToolService", "saveVersion", "updateUI", "", "versionName", "()Ljava/lang/String;", "", "disclamerResId", "Lkotlin/Function0;", "onConfirmed", "showDisclaimerDialog", "(ILkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "service", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "getService", "()Lru/ozon/app/android/storage/debug/DebugToolsService;", "setService", "(Lru/ozon/app/android/storage/debug/DebugToolsService;)V", "Lru/ozon/app/android/debugmenu/data/AbVariantService;", "abVariantService", "Lru/ozon/app/android/debugmenu/data/AbVariantService;", "getAbVariantService", "()Lru/ozon/app/android/debugmenu/data/AbVariantService;", "setAbVariantService", "(Lru/ozon/app/android/debugmenu/data/AbVariantService;)V", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "versionStorage", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "getVersionStorage", "()Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "setVersionStorage", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/debugmenu/databinding/ServiceMeshSuccessActivityBinding;", "binding", "Lru/ozon/app/android/debugmenu/databinding/ServiceMeshSuccessActivityBinding;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebugToolsActivity extends g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public AbVariantService abVariantService;
    private ServiceMeshSuccessActivityBinding binding;
    public GZ.g router;
    public DebugToolsService service;
    public AppVersionStorage versionStorage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/debugmenu/servicemesh/DebugToolsActivity$Companion;", "", "<init>", "()V", "ARG_ACTION", "", "startActivity", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "Lru/ozon/app/android/debugmenu/data/DebugToolAction;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent startActivity(@NotNull Context context, @NotNull DebugToolAction action) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            Intent intent = new Intent(context, (Class<?>) DebugToolsActivity.class);
            intent.putExtra("Action", action);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DebugToolAction.ActionName.values().length];
            try {
                iArr[DebugToolAction.ActionName.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DebugToolAction.ActionName.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DebugToolAction.ActionName.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(DebugToolAction action) {
        updateDebugToolService(action);
        updateUI(action);
    }

    private final void saveVersion(DebugToolAction action) {
        String value = action.getValue();
        if (value != null) {
            getVersionStorage().saveFakeVersion(value);
        }
    }

    private final void showDisclaimerDialog(int disclamerResId, Function0<Unit> onConfirmed) {
        f.a aVar = new f.a(this);
        aVar.e(disclamerResId);
        aVar.m("Ок", new d(onConfirmed, 1));
        aVar.h("Отмена", new DialogInterface.OnClickListener() { // from class: ss.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DebugToolsActivity.this.finish();
            }
        });
        aVar.q();
    }

    private final void updateDebugToolService(DebugToolAction action) {
        String paramsName = action.getParamsName();
        switch (paramsName.hashCode()) {
            case -709607304:
                if (paramsName.equals("x-o3-app-version")) {
                    saveVersion(action);
                    return;
                }
                return;
            case -17340009:
                if (paramsName.equals("x-o3-meshversion")) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[action.getName().ordinal()];
                    if (i11 == 1) {
                        getService().setMeshValue(action.getValue());
                        return;
                    } else if (i11 == 2) {
                        getService().setMeshValue(null);
                        return;
                    } else {
                        if (i11 != 3) {
                            throw new o();
                        }
                        return;
                    }
                }
                return;
            case 163709958:
                if (paramsName.equals("x-o3-ab-variants")) {
                    getAbVariantService().updateAbVariant(action.getName(), action.getValue());
                    return;
                }
                return;
            case 1439656726:
                if (paramsName.equals("x-o3-internal-headers-token")) {
                    int i12 = WhenMappings.$EnumSwitchMapping$0[action.getName().ordinal()];
                    if (i12 == 1) {
                        getService().setInternalHeadersToken(action.getValue());
                        return;
                    } else if (i12 == 2) {
                        getService().setInternalHeadersToken(null);
                        return;
                    } else {
                        if (i12 != 3) {
                            throw new o();
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void updateUI(DebugToolAction action) {
        String str;
        ServiceMeshSuccessActivityBinding serviceMeshSuccessActivityBinding = this.binding;
        if (serviceMeshSuccessActivityBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        serviceMeshSuccessActivityBinding.headerHint.setText("Значение заголовка " + action.getParamsName() + " выставлено:");
        ServiceMeshSuccessActivityBinding serviceMeshSuccessActivityBinding2 = this.binding;
        if (serviceMeshSuccessActivityBinding2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = serviceMeshSuccessActivityBinding2.headerValue;
        String paramsName = action.getParamsName();
        switch (paramsName.hashCode()) {
            case -709607304:
                if (paramsName.equals("x-o3-app-version")) {
                    str = versionName();
                    break;
                }
                str = "unvalid";
                break;
            case -17340009:
                if (paramsName.equals("x-o3-meshversion")) {
                    str = getService().getMeshValue();
                    break;
                }
                str = "unvalid";
                break;
            case 163709958:
                if (paramsName.equals("x-o3-ab-variants")) {
                    str = getService().getAbVariant();
                    break;
                }
                str = "unvalid";
                break;
            case 1439656726:
                if (paramsName.equals("x-o3-internal-headers-token")) {
                    str = getService().getInternalHeadersToken();
                    break;
                }
                str = "unvalid";
                break;
            default:
                str = "unvalid";
                break;
        }
        textView.setText(str);
    }

    private final String versionName() {
        return G.g.c(getVersionStorage().getVersionName(), "-", getVersionStorage().getVersionCode());
    }

    @NotNull
    public final AbVariantService getAbVariantService() {
        AbVariantService abVariantService = this.abVariantService;
        if (abVariantService != null) {
            return abVariantService;
        }
        Intrinsics.n("abVariantService");
        throw null;
    }

    @NotNull
    public final DebugToolsService getService() {
        DebugToolsService debugToolsService = this.service;
        if (debugToolsService != null) {
            return debugToolsService;
        }
        Intrinsics.n("service");
        throw null;
    }

    @NotNull
    public final AppVersionStorage getVersionStorage() {
        AppVersionStorage appVersionStorage = this.versionStorage;
        if (appVersionStorage != null) {
            return appVersionStorage;
        }
        Intrinsics.n("versionStorage");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        DebugToolsComponent.Factory factory = DaggerDebugToolsComponent.factory();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create(storageComponentApi, (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class)).inject(this);
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        ServiceMeshSuccessActivityBinding inflate = ServiceMeshSuccessActivityBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getConstraintLayout());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra2 = intent.getParcelableExtra("Action", DebugToolAction.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("Action");
        }
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DebugToolAction debugToolAction = (DebugToolAction) parcelableExtra;
        Integer disclaimerResId = debugToolAction.getDisclaimerResId();
        if (disclaimerResId != null) {
            showDisclaimerDialog(disclaimerResId.intValue(), new DebugToolsActivity$onCreate$1(this, debugToolAction));
        } else {
            handleAction(debugToolAction);
        }
        ServiceMeshSuccessActivityBinding serviceMeshSuccessActivityBinding = this.binding;
        if (serviceMeshSuccessActivityBinding != null) {
            serviceMeshSuccessActivityBinding.restartAppButton.setOnClickListener(new n(this, 22));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
