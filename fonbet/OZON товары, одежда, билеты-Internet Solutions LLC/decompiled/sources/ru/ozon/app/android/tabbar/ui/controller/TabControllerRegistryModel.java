package ru.ozon.app.android.tabbar.ui.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel;", "", "key", "Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "factory", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "<init>", "(Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;)V", "appName", "", "tabId", "", "(Ljava/lang/String;ILru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;)V", "getKey", "()Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "getFactory", "()Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Key", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabControllerRegistryModel {

    @NotNull
    private final TabUiControllerFactory factory;

    @NotNull
    private final Key key;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/tabbar/ui/controller/TabControllerRegistryModel$Key;", "", "appName", "", "tabId", "", "<init>", "(Ljava/lang/String;I)V", "getAppName", "()Ljava/lang/String;", "getTabId", "()I", "equals", "", "other", "hashCode", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key {

        @NotNull
        private final String appName;
        private final int tabId;

        public Key(@NotNull String appName, int i11) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.appName = appName;
            this.tabId = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.d(this.appName, key.appName) && this.tabId == key.tabId;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        public final int getTabId() {
            return this.tabId;
        }

        public int hashCode() {
            return (this.appName.hashCode() * 31) + this.tabId;
        }
    }

    public TabControllerRegistryModel(@NotNull Key key, @NotNull TabUiControllerFactory factory) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.key = key;
        this.factory = factory;
    }

    @NotNull
    public final TabUiControllerFactory getFactory() {
        return this.factory;
    }

    @NotNull
    public final Key getKey() {
        return this.key;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabControllerRegistryModel(@NotNull String appName, int i11, @NotNull TabUiControllerFactory factory) {
        this(new Key(appName, i11), factory);
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
