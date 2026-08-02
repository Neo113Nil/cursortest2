package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dk8 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ LinkedHashMap e;

    public /* synthetic */ dk8(Context context, boolean z, boolean z2, LinkedHashMap linkedHashMap) {
        this.d = context;
        this.b = z;
        this.c = z2;
        this.e = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool;
        Player playerOut;
        boolean z;
        int i = this.a;
        LinkedHashMap linkedHashMap = this.e;
        switch (i) {
            case 0:
                PlayerData playerData = (PlayerData) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                playerData.getClass();
                return ek8.b(playerData, this.d, this.b, this.c, (y9b) linkedHashMap.get(Integer.valueOf(playerData.getPlayer().getId())), booleanValue);
            default:
                PlayerData playerData2 = (PlayerData) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                playerData2.getClass();
                List<Incident.SubstitutionIncident> substitutionIncidents = playerData2.getSubstitutionIncidents();
                if (substitutionIncidents != null) {
                    if (!substitutionIncidents.isEmpty()) {
                        for (Incident.SubstitutionIncident substitutionIncident : substitutionIncidents) {
                            Player playerIn = substitutionIncident.getPlayerIn();
                            if ((playerIn != null && playerData2.getPlayer().getId() == playerIn.getId()) || ((playerOut = substitutionIncident.getPlayerOut()) != null && playerData2.getPlayer().getId() == playerOut.getId())) {
                                z = true;
                                bool = Boolean.valueOf(z);
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                boolean c = Intrinsics.c(bool, Boolean.TRUE);
                boolean z2 = this.b;
                boolean z3 = this.c;
                return ek8.b(playerData2, this.d, z2 && (c || z3), z3, (y9b) linkedHashMap.get(Integer.valueOf(playerData2.getPlayer().getId())), booleanValue2);
        }
    }

    public /* synthetic */ dk8(boolean z, boolean z2, Context context, LinkedHashMap linkedHashMap) {
        this.b = z;
        this.c = z2;
        this.d = context;
        this.e = linkedHashMap;
    }
}
