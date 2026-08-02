package ru.ozon.app.android.abtool.presentation.features.recycler;

import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000b¨\u0006 "}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "featureDebugModel", "", "localValue", "", "isOverrideEnabled", "<init>", "(Lru/ozon/app/android/abtool/domain/FeatureDebugModel;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "getFeatureDebugModel", "()Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "Ljava/lang/String;", "getLocalValue", "setLocalValue", "(Ljava/lang/String;)V", "Z", "()Z", "id", "getId", "getFeatureValue", "featureValue", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FeatureItem extends ListItem {

    @NotNull
    private final FeatureDebugModel featureDebugModel;

    @NotNull
    private final String id;
    private final boolean isOverrideEnabled;
    private String localValue;

    public /* synthetic */ FeatureItem(FeatureDebugModel featureDebugModel, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureDebugModel, (i11 & 2) != 0 ? featureDebugModel.getLocalValue() : str, z11);
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureItem)) {
            return false;
        }
        FeatureItem featureItem = (FeatureItem) other;
        return Intrinsics.d(this.featureDebugModel, featureItem.featureDebugModel) && Intrinsics.d(this.localValue, featureItem.localValue) && this.isOverrideEnabled == featureItem.isOverrideEnabled;
    }

    @NotNull
    public final FeatureDebugModel getFeatureDebugModel() {
        return this.featureDebugModel;
    }

    @NotNull
    public final String getFeatureValue() {
        String str = this.localValue;
        return str == null ? this.featureDebugModel.getFeatureValue(this.isOverrideEnabled) : str;
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public final String getLocalValue() {
        return this.localValue;
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    public int hashCode() {
        int hashCode = this.featureDebugModel.hashCode() * 31;
        String str = this.localValue;
        return Boolean.hashCode(this.isOverrideEnabled) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void setLocalValue(String str) {
        this.localValue = str;
    }

    @NotNull
    public String toString() {
        FeatureDebugModel featureDebugModel = this.featureDebugModel;
        String str = this.localValue;
        boolean z11 = this.isOverrideEnabled;
        StringBuilder sb2 = new StringBuilder("FeatureItem(featureDebugModel=");
        sb2.append(featureDebugModel);
        sb2.append(", localValue=");
        sb2.append(str);
        sb2.append(", isOverrideEnabled=");
        return a.a(")", sb2, z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureItem(@NotNull FeatureDebugModel featureDebugModel, String str, boolean z11) {
        super(null);
        Intrinsics.checkNotNullParameter(featureDebugModel, "featureDebugModel");
        this.featureDebugModel = featureDebugModel;
        this.localValue = str;
        this.isOverrideEnabled = z11;
        this.id = featureDebugModel.getId();
    }
}
