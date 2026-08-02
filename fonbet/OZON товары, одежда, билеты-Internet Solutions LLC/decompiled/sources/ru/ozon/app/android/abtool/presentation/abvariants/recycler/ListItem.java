package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ListItem;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/AddVariantItem;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/ClearVariantsItem;", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ListItem {
    public /* synthetic */ ListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getId();

    private ListItem() {
    }
}
