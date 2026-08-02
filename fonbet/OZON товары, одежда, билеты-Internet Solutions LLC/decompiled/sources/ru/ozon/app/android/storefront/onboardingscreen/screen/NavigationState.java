package ru.ozon.app.android.storefront.onboardingscreen.screen;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "", "<init>", "()V", "InitialState", "LaunchAuth", "LaunchGeo", "CloseScreenFlow", "EnableSystemPermissions", "LaunchComposerPage", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$CloseScreenFlow;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$EnableSystemPermissions;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$InitialState;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchAuth;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchComposerPage;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchGeo;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NavigationState {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$CloseScreenFlow;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "Landroid/net/Uri;", "result", "ref", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getResult", "()Landroid/net/Uri;", "getRef", "isDeeplinkOpener", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseScreenFlow extends NavigationState {
        private final boolean isDeeplinkOpener;
        private final Uri ref;
        private final Uri result;

        public CloseScreenFlow(Uri uri, Uri uri2) {
            super(null);
            this.result = uri;
            this.ref = uri2;
            this.isDeeplinkOpener = (uri == null && uri2 == null) ? false : true;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CloseScreenFlow)) {
                return false;
            }
            CloseScreenFlow closeScreenFlow = (CloseScreenFlow) other;
            return Intrinsics.d(this.result, closeScreenFlow.result) && Intrinsics.d(this.ref, closeScreenFlow.ref);
        }

        public final Uri getRef() {
            return this.ref;
        }

        public final Uri getResult() {
            return this.result;
        }

        public int hashCode() {
            Uri uri = this.result;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            Uri uri2 = this.ref;
            return hashCode + (uri2 != null ? uri2.hashCode() : 0);
        }

        /* renamed from: isDeeplinkOpener, reason: from getter */
        public final boolean getIsDeeplinkOpener() {
            return this.isDeeplinkOpener;
        }

        @NotNull
        public String toString() {
            return "CloseScreenFlow(result=" + this.result + ", ref=" + this.ref + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$EnableSystemPermissions;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "shouldAwaitRemote", "", "<init>", "(Z)V", "getShouldAwaitRemote", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnableSystemPermissions extends NavigationState {
        private final boolean shouldAwaitRemote;

        public EnableSystemPermissions(boolean z11) {
            super(null);
            this.shouldAwaitRemote = z11;
        }

        public final boolean getShouldAwaitRemote() {
            return this.shouldAwaitRemote;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$InitialState;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialState extends NavigationState {

        @NotNull
        public static final InitialState INSTANCE = new InitialState();

        private InitialState() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InitialState);
        }

        public int hashCode() {
            return 1794607322;
        }

        @NotNull
        public String toString() {
            return "InitialState";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchAuth;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchAuth extends NavigationState {

        @NotNull
        public static final LaunchAuth INSTANCE = new LaunchAuth();

        private LaunchAuth() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchAuth);
        }

        public int hashCode() {
            return -1865225112;
        }

        @NotNull
        public String toString() {
            return "LaunchAuth";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchComposerPage;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LaunchComposerPage extends NavigationState {

        @NotNull
        private final String deeplink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchComposerPage(@NotNull String deeplink) {
            super(null);
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState$LaunchGeo;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/NavigationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LaunchGeo extends NavigationState {

        @NotNull
        public static final LaunchGeo INSTANCE = new LaunchGeo();

        private LaunchGeo() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchGeo);
        }

        public int hashCode() {
            return -752899951;
        }

        @NotNull
        public String toString() {
            return "LaunchGeo";
        }
    }

    public /* synthetic */ NavigationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigationState() {
    }
}
