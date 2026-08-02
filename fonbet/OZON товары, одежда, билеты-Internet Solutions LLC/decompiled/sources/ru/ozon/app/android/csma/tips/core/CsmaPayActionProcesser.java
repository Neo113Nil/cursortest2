package ru.ozon.app.android.csma.tips.core;

import Nh.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "", "applicationInfoDataSource", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "<init>", "(Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;)V", "getActionModel", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser$ActionModel;", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "tipsAmount", "", "getParams", "", "ActionModel", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CsmaPayActionProcesser {

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser$ActionModel;", "", "", "link", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionModel {

        @NotNull
        private final String link;

        @NotNull
        private final Map<String, String> params;

        public ActionModel(@NotNull String link, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(params, "params");
            this.link = link;
            this.params = params;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionModel)) {
                return false;
            }
            ActionModel actionModel = (ActionModel) other;
            return Intrinsics.d(this.link, actionModel.link) && Intrinsics.d(this.params, actionModel.params);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.link.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("ActionModel(link=", this.link, ", params=", ")", this.params);
        }
    }

    public CsmaPayActionProcesser(@NotNull ApplicationInfoDataSource applicationInfoDataSource) {
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        this.applicationInfoDataSource = applicationInfoDataSource;
    }

    private final Map<String, String> getParams(AtomAction.Click action, String tipsAmount) {
        Map<String, String> params = action.getParams();
        if (params == null) {
            return null;
        }
        LinkedHashMap u11 = U.u(params);
        u11.put("deviceId", this.applicationInfoDataSource.getUniqueApplicationId());
        if (tipsAmount != null) {
            u11.put("tipsAmount", tipsAmount);
        }
        return u11;
    }

    public final ActionModel getActionModel(@NotNull AtomAction.Click action, String tipsAmount) {
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = getParams(action, tipsAmount);
        if (params == null || (link = action.getLink()) == null) {
            return null;
        }
        return new ActionModel(link, params);
    }
}
