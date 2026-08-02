package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.E;
import com.ironsource.I;
import com.ironsource.J2;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.tv.fragments.NewChannelsDialog;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kr9 implements bh, xn3, c4a, E, dpi, p3c, cpi, v08, pub, ekj, xd, k4f, ofk, yc8, yu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.p3c, defpackage.q3c
    public int a(Object obj) {
        try {
            return ((z2c) obj).c((sm8) this.b) ? 1 : 0;
        } catch (l3c unused) {
            return -1;
        }
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ou ouVar = (ou) obj2;
                ouVar.getClass();
                HashSet hashSet = new HashSet();
                Iterator<E> it = ((wy7) obj).j().iterator();
                while (it.hasNext()) {
                    for (i53 i53Var : ((yi2) it.next()).n()) {
                        if (!TextUtils.isEmpty(i53Var.h().getName())) {
                            hashSet.add(i53Var.h().getName());
                        }
                    }
                }
                hashSet.size();
                hashSet.toString();
                ouVar.c.b(hashSet);
                break;
            default:
                ekg ekgVar = (ekg) obj2;
                wy7 wy7Var = (wy7) obj;
                d4a d4aVar = (d4a) ekgVar.d;
                if (!ekgVar.a) {
                    if (ekgVar.b) {
                        int i2 = ekgVar.c + 1;
                        ekgVar.c = i2;
                        if (i2 >= 5) {
                            ekgVar.b = false;
                            d4aVar.w("fresh_install", false);
                        }
                    }
                    Iterator<E> it2 = wy7Var.j().iterator();
                    while (it2.hasNext()) {
                        if (((yi2) it2.next()).k()) {
                            ekgVar.a = true;
                            d4aVar.w("test_device", true);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        ((hgf) this.b).a = vffVar.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00c6  */
    @Override // defpackage.v08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(File file) {
        int available;
        byte[] bArr;
        HashMap hashMap;
        HashMap hashMap2;
        ktc ktcVar;
        HashMap hashMap3;
        ArrayList arrayList = (ArrayList) this.b;
        HashMap hashMap4 = ktc.m;
        int i = 0;
        if (!cw3.a.contains(rik.class)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                cw3.a(rik.class, th);
            }
            if (available >= 4) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available >= i3) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.UTF_8));
                    JSONArray names = jSONObject.names();
                    int length = names.length();
                    String[] strArr = new String[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        strArr[i4] = names.getString(i4);
                    }
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    hashMap = new HashMap();
                    int i5 = 0;
                    while (i5 < length) {
                        String str = strArr[i5];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i6 = 1;
                            for (int i7 = i; i7 < length2; i7++) {
                                int i8 = jSONArray.getInt(i7);
                                iArr[i7] = i8;
                                i6 *= i8;
                            }
                            int i9 = i6 * 4;
                            int i10 = i3 + i9;
                            if (i10 <= available) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i9);
                                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                                knb knbVar = new knb(iArr);
                                wrap2.asFloatBuffer().get(knbVar.c, 0, i6);
                                hashMap.put(str, knbVar);
                                i3 = i10;
                            }
                        }
                        i5++;
                        i = 0;
                    }
                    if (hashMap != null) {
                        hashMap2 = new HashMap();
                        if (!cw3.a.contains(ktc.class)) {
                            try {
                                hashMap3 = ktc.m;
                            } catch (Throwable th2) {
                                cw3.a(ktc.class, th2);
                            }
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                if (!hashMap3.containsKey(entry.getKey()) || (str2 = (String) hashMap3.get(entry.getKey())) != null) {
                                    hashMap2.put(str2, entry.getValue());
                                }
                            }
                            if (hashMap2 != null) {
                                try {
                                    ktcVar = new ktc(hashMap2);
                                } catch (Exception unused2) {
                                }
                                if (ktcVar != null) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        rtc rtcVar = (rtc) it.next();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(rtcVar.a);
                                        sb.append('_');
                                        String h = fc6.h(rtcVar.d, "_rule", sb);
                                        String str3 = rtcVar.c;
                                        ow9 ow9Var = new ow9(4, rtcVar, ktcVar);
                                        File file2 = new File(rik.p(), h);
                                        if (str3 == null || file2.exists()) {
                                            ow9Var.c(file2);
                                        } else {
                                            new w08(str3, file2, ow9Var).execute(new String[0]);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            ktcVar = null;
                            if (ktcVar != null) {
                            }
                        }
                        hashMap3 = null;
                        while (r3.hasNext()) {
                        }
                        if (hashMap2 != null) {
                        }
                        ktcVar = null;
                        if (ktcVar != null) {
                        }
                    }
                    hashMap2 = null;
                    if (hashMap2 != null) {
                    }
                    ktcVar = null;
                    if (ktcVar != null) {
                    }
                }
            }
        }
        hashMap = null;
        if (hashMap != null) {
        }
        hashMap2 = null;
        if (hashMap2 != null) {
        }
        ktcVar = null;
        if (ktcVar != null) {
        }
    }

    @Override // defpackage.yc8
    public void d(vb8 vb8Var) {
        ((bcf) ((d4a) this.b).b).a = new kr9(vb8Var, 26);
    }

    @Override // defpackage.c4a
    public boolean e(d4a d4aVar, int i, Bundle bundle) {
        yo3 yo3Var;
        zb0 zb0Var = (zb0) this.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((j0l) d4aVar.b).b).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((j0l) d4aVar.b).b;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        j0l j0lVar = (j0l) d4aVar.b;
        j0l j0lVar2 = (j0l) d4aVar.b;
        ClipData clipData = new ClipData(((InputContentInfo) j0lVar.b).getDescription(), new ClipData.Item(((InputContentInfo) j0lVar2.b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            yo3Var = new xo3(clipData, 2);
        } else {
            zo3 zo3Var = new zo3();
            zo3Var.b = clipData;
            zo3Var.c = 2;
            yo3Var = zo3Var;
        }
        yo3Var.a(((InputContentInfo) j0lVar2.b).getLinkUri());
        yo3Var.setExtras(bundle);
        return bsk.m(zb0Var, yo3Var.build()) == null;
    }

    @Override // defpackage.pub
    public Object f(Object obj, Object obj2) {
        return w3a.S((List) ((Collection) obj2), new lub(((bzc) this.b).f, obj));
    }

    @Override // defpackage.dpi
    public void g() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                int i2 = LeagueHistoricalDataActivity.Q;
                ((LeagueHistoricalDataActivity) obj).N();
                break;
            case 6:
                int i3 = ManagerActivity.R;
                ((ManagerActivity) obj).N();
                break;
            case 9:
                ((MediaHighlightsActivity) obj).L.invoke();
                break;
            case 10:
                int i4 = MmaFightNightActivity.R;
                ((MmaFightNightActivity) obj).N();
                break;
            case 11:
                int i5 = MmaFighterActivity.U;
                ((MmaFighterActivity) obj).N();
                break;
            case 12:
                int i6 = MmaOrganisationActivity.T;
                ((MmaOrganisationActivity) obj).N();
                break;
            case 19:
                int i7 = PlayerActivity.Z;
                ((PlayerActivity) obj).N();
                break;
            default:
                int i8 = ProfileActivity.Q;
                ((ProfileActivity) obj).N();
                break;
        }
    }

    @Override // defpackage.bh
    public ViewGroup getAdViewGroup() {
        ImaPresenterActivity imaPresenterActivity = (ImaPresenterActivity) this.b;
        int i = ImaPresenterActivity.o;
        return ((wql) imaPresenterActivity.p()).b;
    }

    @Override // defpackage.ofk
    public void h(zzbe zzbeVar) {
        Activity activity = (Activity) this.b;
        if (activity.isDestroyed() || zic.f) {
            return;
        }
        zic.f = true;
        zzbeVar.a(activity, new p7f(activity, 1));
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        nv.l0(applicationContext, dv.OTHER, bv.GOOGLE_PRIVACY_POLICY, null);
    }

    @Override // defpackage.cpi
    public boolean i(SwipeRefreshLayout swipeRefreshLayout, View view) {
        krk krkVar = ((MmaOrganisationRankingsFragment) this.b).l;
        krkVar.getClass();
        return ((gp8) krkVar).g.canScrollVertically(-1);
    }

    @Override // defpackage.k4f
    public void m(Preference preference) {
        SharedPreferences d;
        PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
        SwitchPreference switchPreference = (SwitchPreference) preference;
        Context requireContext = preferenceFragment.requireContext();
        requireContext.getClass();
        kv kvVar = kv.SWITCH_ON;
        if (!switchPreference.M) {
            kvVar = null;
        }
        if (kvVar == null) {
            kvVar = kv.SWITCH_OFF;
        }
        nv.z0(requireContext, kvVar, "show_third_party_promotions", "settings");
        Set set = aef.a;
        Context requireContext2 = preferenceFragment.requireContext();
        requireContext2.getClass();
        boolean z = switchPreference.M;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PREF_PROMOTIONS_ENABLE", z);
        Unit unit = Unit.a;
        i.apply();
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 17:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) obj2;
                Map map = (Map) obj;
                int i2 = NotificationSettingsActivity.O;
                map.getClass();
                if (!map.values().contains(Boolean.FALSE)) {
                    notificationSettingsActivity.Q().u();
                    break;
                }
                break;
            default:
                ProfilePredictionsFragment profilePredictionsFragment = (ProfilePredictionsFragment) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a == -1) {
                    profilePredictionsFragment.u();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ekj
    public boolean onMenuItemClick(MenuItem menuItem) {
        NewChannelsDialog newChannelsDialog = (NewChannelsDialog) this.b;
        g4k g4kVar = (g4k) newChannelsDialog.q.getValue();
        ArrayList arrayList = ((pbd) newChannelsDialog.s.getValue()).i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((TvChannel) next).getIsSelected()) {
                arrayList2.add(next);
            }
        }
        xw3.L(g4kVar.h(), null, null, new t3((Object) g4kVar, (Object) arrayList2, true, (rq3) null, 14), 3);
        newChannelsDialog.k(false, false);
        return true;
    }

    @Override // com.ironsource.E
    public B a(C c, I i) {
        B a;
        a = J2.a((J2) this.b, c, i);
        return a;
    }
}
