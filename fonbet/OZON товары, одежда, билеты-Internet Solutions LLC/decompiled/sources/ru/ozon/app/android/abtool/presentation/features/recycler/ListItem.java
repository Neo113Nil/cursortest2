package ru.ozon.app.android.abtool.presentation.features.recycler;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ServiceHeader;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ListItem {
    public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ListItem) {
            return Intrinsics.d(getId(), ((ListItem) other).getId());
        }
        return false;
    }

    @NotNull
    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    private ListItem() {
    }
}
