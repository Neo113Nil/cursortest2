package li0;

import androidx.annotation.NonNull;
import ru.ozon.tracker.db.entities.UserData;

/* loaded from: classes7.dex */
final class n extends J4.l<UserData> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull UserData userData) {
        UserData userData2 = userData;
        fVar.m0(1, userData2.getAbGroup());
        fVar.m0(2, userData2.getRegionId());
        fVar.e0(3, userData2.getUserId());
        if (userData2.getCompanyId() == null) {
            fVar.C0(4);
        } else {
            fVar.m0(4, userData2.getCompanyId().intValue());
        }
        fVar.e0(5, userData2.getUserRoles());
        fVar.m0(6, userData2.getId());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `user_data` (`ab_group`,`region_id`,`user_id`,`company_id`,`user_roles`,`id`) VALUES (?,?,?,?,?,?)";
    }
}
