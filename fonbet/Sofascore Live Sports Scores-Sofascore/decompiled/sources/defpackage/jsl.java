package defpackage;

import com.blaze.blazesdk.delegates.BlazeFollowEntitiesDelegate;
import com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jsl implements IBlazeFollowEntitiesManager {
    public BlazeFollowEntitiesDelegate a;
    public Set b = rm5.a;
    public final b5m c = new b5m();

    public static glm a(List list, BlazeFollowEntityType blazeFollowEntityType) {
        blazeFollowEntityType.getClass();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                glm glmVar = (glm) it.next();
                if (c(blazeFollowEntityType, glmVar.b)) {
                    return glmVar;
                }
                if (blazeFollowEntityType instanceof BlazeFollowEntityType.FirstAvailable) {
                    return glmVar;
                }
            }
        }
        return null;
    }

    public static boolean c(BlazeFollowEntityType blazeFollowEntityType, umm ummVar) {
        BlazeFollowEntityType blazeFollowEntityType2;
        boolean z = blazeFollowEntityType instanceof BlazeFollowEntityType.Team;
        if (z) {
            if (ummVar == umm.TEAM) {
                return true;
            }
        } else if (blazeFollowEntityType instanceof BlazeFollowEntityType.Player) {
            if (ummVar == umm.PLAYER) {
                return true;
            }
        } else if (blazeFollowEntityType instanceof BlazeFollowEntityType.Property) {
            if (ummVar == umm.PROPERTY) {
                return true;
            }
        } else if (!(blazeFollowEntityType instanceof BlazeFollowEntityType.FirstAvailable)) {
            zzl.b();
            return false;
        }
        if (blazeFollowEntityType instanceof BlazeFollowEntityType.Player) {
            blazeFollowEntityType2 = ((BlazeFollowEntityType.Player) blazeFollowEntityType).getFallbackType();
        } else if (z) {
            blazeFollowEntityType2 = ((BlazeFollowEntityType.Team) blazeFollowEntityType).getFallbackType();
        } else if (blazeFollowEntityType instanceof BlazeFollowEntityType.Property) {
            blazeFollowEntityType2 = ((BlazeFollowEntityType.Property) blazeFollowEntityType).getFallbackType();
        } else {
            if (!(blazeFollowEntityType instanceof BlazeFollowEntityType.FirstAvailable)) {
                zzl.b();
                return false;
            }
            blazeFollowEntityType2 = null;
        }
        if (blazeFollowEntityType2 != null) {
            return c(blazeFollowEntityType2, ummVar);
        }
        return false;
    }

    public final void b(Set set) {
        synchronized (this) {
            this.b = set;
            this.c.k(set);
            Unit unit = Unit.a;
        }
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final BlazeFollowEntitiesDelegate getDelegate() {
        return this.a;
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final Set getFollowedEntities() {
        Set set;
        synchronized (this) {
            set = this.b;
        }
        return set;
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final void insertFollowedEntities(Set set) {
        set.getClass();
        synchronized (this) {
            b(y9h.f(this.b, set));
            Unit unit = Unit.a;
        }
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final void removeFollowedEntities(Set set) {
        set.getClass();
        synchronized (this) {
            b(y9h.e(this.b, set));
            Unit unit = Unit.a;
        }
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final void setDelegate(BlazeFollowEntitiesDelegate blazeFollowEntitiesDelegate) {
        this.a = blazeFollowEntitiesDelegate;
    }

    @Override // com.blaze.blazesdk.follow.IBlazeFollowEntitiesManager
    public final void setFollowedEntities(Set set) {
        set.getClass();
        synchronized (this) {
            b(set);
            Unit unit = Unit.a;
        }
    }
}
