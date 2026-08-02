package ru.ozon.app.android.abtool.presentation.features.recycler;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/ServiceHeader;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getId", "id", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ServiceHeader extends ListItem {

    @NotNull
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceHeader(@NotNull String title) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ServiceHeader) && Intrinsics.d(this.title, ((ServiceHeader) other).title);
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    @NotNull
    /* renamed from: getId, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.ListItem
    public int hashCode() {
        return this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("ServiceHeader(title=", this.title, ")");
    }
}
