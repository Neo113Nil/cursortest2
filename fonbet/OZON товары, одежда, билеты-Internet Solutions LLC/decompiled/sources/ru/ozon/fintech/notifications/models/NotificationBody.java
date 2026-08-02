package ru.ozon.fintech.notifications.models;

import C.o0;
import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationBody;", "", "body", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationBody {

    @NotNull
    private final String body;

    @NotNull
    private final String title;

    @NotNull
    private final String type;

    public NotificationBody(@NotNull String body, @NotNull String title, @NotNull String type) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.body = body;
        this.title = title;
        this.type = type;
    }

    public static /* synthetic */ NotificationBody copy$default(NotificationBody notificationBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationBody.body;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationBody.title;
        }
        if ((i11 & 4) != 0) {
            str3 = notificationBody.type;
        }
        return notificationBody.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final NotificationBody copy(@NotNull String body, @NotNull String title, @NotNull String type) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new NotificationBody(body, title, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBody)) {
            return false;
        }
        NotificationBody notificationBody = (NotificationBody) other;
        return Intrinsics.d(this.body, notificationBody.body) && Intrinsics.d(this.title, notificationBody.title) && Intrinsics.d(this.type, notificationBody.type);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + g.a(this.body.hashCode() * 31, 31, this.title);
    }

    @NotNull
    public String toString() {
        String str = this.body;
        String str2 = this.title;
        return o0.c(C3660k.d("NotificationBody(body=", str, ", title=", str2, ", type="), this.type, ")");
    }
}
