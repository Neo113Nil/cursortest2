package ru.ozon.app.android.account.adult.ui;

import Kz.DialogInterfaceOnClickListenerC3536b;
import N3.C3660k;
import Xc.a;
import Xc.b;
import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.R$layout;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.account.adult.ui.AdultDialog;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/account/adult/ui/AdultDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onStop", "onDestroy", "Landroidx/fragment/app/G;", "manager", "", "tag", "show", "(Landroidx/fragment/app/G;Ljava/lang/String;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lru/ozon/app/android/account/adult/ui/AdultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/account/adult/ui/AdultListener;", "getListener", "()Lru/ozon/app/android/account/adult/ui/AdultListener;", "setListener", "(Lru/ozon/app/android/account/adult/ui/AdultListener;)V", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "customisation", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "getCustomisation", "()Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "setCustomisation", "(Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;)V", "Landroidx/appcompat/app/f;", "alert", "Landroidx/appcompat/app/f;", "Companion", "Customisation", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdultDialog extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean shown;
    private f alert;
    private Customisation customisation = new Customisation(null, null, null, null, 15, null);
    private AdultListener listener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/adult/ui/AdultDialog$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/account/adult/ui/AdultDialog;", "getInstance", "()Lru/ozon/app/android/account/adult/ui/AdultDialog;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdultDialog getInstance() {
            return new AdultDialog();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation;", "", "", "message", "positiveText", "negativeText", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation$Style;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation$Style;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getPositiveText", "getNegativeText", "Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation$Style;", "getStyle", "()Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation$Style;", "Style", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Customisation {
        private final String message;
        private final String negativeText;
        private final String positiveText;

        @NotNull
        private final Style style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/adult/ui/AdultDialog$Customisation$Style;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_SCREEN", "NO_STYLE", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style FULL_SCREEN = new Style("FULL_SCREEN", 0);
            public static final Style NO_STYLE = new Style("NO_STYLE", 1);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{FULL_SCREEN, NO_STYLE};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Style(String str, int i11) {
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public Customisation() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Customisation)) {
                return false;
            }
            Customisation customisation = (Customisation) other;
            return Intrinsics.d(this.message, customisation.message) && Intrinsics.d(this.positiveText, customisation.positiveText) && Intrinsics.d(this.negativeText, customisation.negativeText) && this.style == customisation.style;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getNegativeText() {
            return this.negativeText;
        }

        public final String getPositiveText() {
            return this.positiveText;
        }

        @NotNull
        public final Style getStyle() {
            return this.style;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.positiveText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.negativeText;
            return this.style.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.message;
            String str2 = this.positiveText;
            String str3 = this.negativeText;
            Style style = this.style;
            StringBuilder d11 = C3660k.d("Customisation(message=", str, ", positiveText=", str2, ", negativeText=");
            d11.append(str3);
            d11.append(", style=");
            d11.append(style);
            d11.append(")");
            return d11.toString();
        }

        public Customisation(String str, String str2, String str3, @NotNull Style style) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.message = str;
            this.positiveText = str2;
            this.negativeText = str3;
            this.style = style;
        }

        public /* synthetic */ Customisation(String str, String str2, String str3, Style style, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? Style.FULL_SCREEN : style);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Customisation.Style.values().length];
            try {
                iArr[Customisation.Style.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$2$lambda$0(AdultDialog adultDialog, DialogInterface dialogInterface, int i11) {
        adultDialog.dismiss();
        AdultListener adultListener = adultDialog.listener;
        if (adultListener != null) {
            adultListener.onAdultAccept();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$2$lambda$1(AdultDialog adultDialog, DialogInterface dialogInterface, int i11) {
        adultDialog.dismiss();
        AdultListener adultListener = adultDialog.listener;
        if (adultListener != null) {
            adultListener.onAdultReject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$4$lambda$3(AdultDialog adultDialog, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        AdultListener adultListener;
        if (i11 != 4 || (adultListener = adultDialog.listener) == null) {
            return true;
        }
        adultListener.onAdultReject();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        Customisation customisation = this.customisation;
        Customisation.Style style = customisation != null ? customisation.getStyle() : null;
        if ((style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1) {
            setStyle(0, R.style.Theme.Light.NoTitleBar.Fullscreen);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_adult_dialog, container, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        this.listener = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        shown = false;
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        String string;
        String string2;
        String string3;
        super.onStart();
        Customisation customisation = this.customisation;
        if (customisation == null || (string = customisation.getMessage()) == null) {
            string = StringProvider.getString(R$string.adult_dialog_request);
        }
        Customisation customisation2 = this.customisation;
        if (customisation2 == null || (string2 = customisation2.getPositiveText()) == null) {
            string2 = StringProvider.getString(R$string.common_adult_confirm);
        }
        Customisation customisation3 = this.customisation;
        if (customisation3 == null || (string3 = customisation3.getNegativeText()) == null) {
            string3 = StringProvider.getString(R$string.common_adult_cancel);
        }
        if (getContext() == null) {
            dismiss();
            return;
        }
        f.a aVar = new f.a(requireContext());
        aVar.f(string);
        aVar.m(string2, new DialogInterfaceOnClickListenerC3536b(this, 1));
        aVar.h(string3, new DialogInterface.OnClickListener() { // from class: ck.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AdultDialog.onStart$lambda$2$lambda$1(AdultDialog.this, dialogInterface, i11);
            }
        });
        f create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ck.b
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                boolean onStart$lambda$4$lambda$3;
                onStart$lambda$4$lambda$3 = AdultDialog.onStart$lambda$4$lambda$3(AdultDialog.this, dialogInterface, i11, keyEvent);
                return onStart$lambda$4$lambda$3;
            }
        });
        create.show();
        this.alert = create;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        f fVar = this.alert;
        if (fVar != null) {
            fVar.hide();
        }
        super.onStop();
        shown = false;
    }

    public final void setCustomisation(Customisation customisation) {
        this.customisation = customisation;
    }

    public final void setListener(AdultListener adultListener) {
        this.listener = adultListener;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public void show(@NotNull G manager, String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (shown) {
            return;
        }
        super.show(manager, tag);
        shown = true;
    }
}
