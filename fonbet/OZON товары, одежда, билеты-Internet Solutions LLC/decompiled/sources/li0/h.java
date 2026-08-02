package li0;

import androidx.annotation.NonNull;
import ru.ozon.tracker.db.entities.DbEvent;

/* loaded from: classes7.dex */
final class h extends J4.k<DbEvent> {
    @Override // J4.k
    protected final void bind(@NonNull O4.f fVar, @NonNull DbEvent dbEvent) {
        fVar.e0(1, dbEvent.getUuid());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "DELETE FROM `event` WHERE `uuid` = ?";
    }
}
