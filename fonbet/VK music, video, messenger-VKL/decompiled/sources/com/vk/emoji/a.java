package com.vk.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import xsna.arm0;
import xsna.dgh0;
import xsna.drm0;
import xsna.hpt0;
import xsna.idp;
import xsna.iep;
import xsna.kdp;
import xsna.kep;
import xsna.mep;
import xsna.o9f0;
import xsna.odp;
import xsna.qdp;
import xsna.rdp;
import xsna.sdp;

/* compiled from: EmojiAdapter.java */
/* loaded from: classes18.dex */
public final class a extends RecyclerView.Adapter<kdp> implements dgh0 {
    public final Context c;
    public final EmojiRecyclerView d;
    public final o9f0 e;
    public final iep f;
    public sdp g;
    public Typeface h;

    @Nullable
    public c i;

    @Nullable
    public PopupWindow j;
    public final int k;
    public final int l;
    public final int[] m;
    public final ArrayList<mep> n = new ArrayList<>();
    public final C1024a o = new C1024a();

    /* compiled from: EmojiAdapter.java */
    /* renamed from: com.vk.emoji.a$a, reason: collision with other inner class name */
    public class C1024a implements qdp {
        public C1024a() {
        }
    }

    public a(Context context, EmojiRecyclerView emojiRecyclerView, o9f0 o9f0Var, sdp sdpVar, Typeface typeface) {
        this.c = context;
        this.d = emojiRecyclerView;
        this.e = o9f0Var;
        this.g = sdpVar;
        this.h = typeface;
        int i = hpt0.c;
        this.l = i;
        this.m = new int[i];
        this.f = new iep(context);
        int i2 = 0;
        for (int i3 = 0; i3 < this.l; i3++) {
            this.m[i3] = i2 + i3;
            i2 += hpt0.b[i3].length;
        }
        this.k = i2;
        A0();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void A0() {
        String str;
        int i = this.d.c * 3;
        ArrayList<mep> arrayList = this.n;
        arrayList.clear();
        o9f0 o9f0Var = this.e;
        HashMap<String, Pair<Long, Long>> hashMap = o9f0Var.b;
        String string = ((SharedPreferences) o9f0Var.a.getValue()).getString("recents_v3", "");
        ArrayList arrayList2 = new ArrayList();
        if (string == null || string.length() == 0 || !drm0.D(string, "\t", false)) {
            for (int i2 = 0; i2 < 34; i2++) {
                String str2 = o9f0.e[i2];
                hashMap.put(str2, new Pair<>(1L, 0L));
                arrayList2.add(new mep(str2, o9f0Var.b(str2)));
            }
        } else {
            hashMap.clear();
            for (String str3 : drm0.c0(string, new String[]{StringUtils.COMMA}, 0, 6)) {
                List c0 = drm0.c0(str3, new String[]{"\t"}, 0, 6);
                Long n = arm0.n((String) c0.get(0));
                long longValue = n != null ? n.longValue() : (long) Float.parseFloat((String) c0.get(0));
                String str4 = (String) drm0.c0(str3, new String[]{"\t"}, 0, 6).get(1);
                HashMap<String, String> hashMap2 = o9f0Var.d;
                if (hashMap2.containsKey(str4)) {
                    str = hashMap2.get(str4);
                } else {
                    String l = hpt0.l(str4);
                    hashMap2.put(str4, l);
                    str = l;
                }
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new Pair<>(Long.valueOf(longValue), 0L));
                    arrayList2.add(new mep(str, o9f0Var.b(str)));
                }
            }
        }
        arrayList.addAll(arrayList2.subList(0, Math.min(arrayList2.size(), i)));
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return z0() + this.l + this.k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return y0(i) == null ? 0 : 1;
    }

    @Override // xsna.dgh0
    public final int j0(float f) {
        int i = this.n.size() > 0 ? 1 : 0;
        int[] iArr = this.m;
        int length = iArr.length;
        if (i != 0) {
            length++;
        }
        int i2 = (int) ((length - 1) * f);
        if (i2 != 0 || i == 0) {
            return z0() + iArr[i2 - i];
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(kdp kdpVar, int i) {
        int i2;
        kdp kdpVar2 = kdpVar;
        if (kdpVar2.getClass() == odp.class) {
            mep y0 = y0(i);
            if (y0 != null) {
                odp odpVar = (odp) kdpVar2;
                rdp rdpVar = odpVar.o;
                odpVar.p = y0;
                String[][] strArr = y0.b;
                if (strArr != null) {
                    rdpVar.setOnLongClickListener(odpVar);
                } else {
                    rdpVar.setOnLongClickListener(null);
                }
                iep iepVar = odpVar.m;
                String str = y0.a;
                String str2 = (String) ((HashMap) iepVar.b.getValue()).get(str);
                if (str2 != null) {
                    str = str2;
                }
                odpVar.q = str;
                rdpVar.a(str, strArr != null);
                rdpVar.setContentDescription(odpVar.q);
                return;
            }
            return;
        }
        idp idpVar = (idp) kdpVar2;
        Resources resources = this.c.getResources();
        int z0 = z0();
        if (i != 0 || z0 <= 0) {
            int binarySearch = Arrays.binarySearch(this.m, i - z0);
            if (binarySearch < 0) {
                throw new RuntimeException("Invalid emoji set");
            }
            switch (binarySearch) {
                case 1:
                    i2 = R.string.vk_emoji_gestures_and_people;
                    break;
                case 2:
                    i2 = R.string.vk_emoji_animals_and_plants;
                    break;
                case 3:
                    i2 = R.string.vk_emoji_food_and_drink;
                    break;
                case 4:
                    i2 = R.string.vk_emoji_sport_and_activity;
                    break;
                case 5:
                    i2 = R.string.vk_emoji_travels_and_transport;
                    break;
                case 6:
                    i2 = R.string.vk_emoji_objects;
                    break;
                case 7:
                    i2 = R.string.vk_emoji_symbols;
                    break;
                case 8:
                    i2 = R.string.vk_emoji_flags;
                    break;
                default:
                    i2 = R.string.vk_emoji_emojis;
                    break;
            }
        } else {
            i2 = R.string.vk_emoji_frequently_used;
        }
        idpVar.l.setText(resources.getString(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final kdp onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i == 0) {
            return new idp(context, this.h);
        }
        return new odp(context, this.e, this.f, this.o);
    }

    public final void x0() {
        PopupWindow popupWindow = this.j;
        if (popupWindow != null) {
            View contentView = popupWindow.getContentView();
            if (contentView instanceof kep) {
                ((kep) contentView).setListener(null);
            }
            this.j.dismiss();
        }
        c cVar = this.i;
        if (cVar != null && !cVar.h()) {
            this.i.dispose();
        }
        this.j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final mep y0(int i) {
        if (i == 0) {
            return null;
        }
        int z0 = z0();
        if (i < z0) {
            return this.n.get(i - 1);
        }
        int i2 = i - z0;
        int[] iArr = this.m;
        if (Arrays.binarySearch(iArr, i2) >= 0) {
            return null;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i3 = iArr[length];
            if (i2 > i3) {
                Object obj = hpt0.b[length][(i2 - i3) - 1];
                if (obj instanceof String) {
                    return new mep((String) obj, null);
                }
                if (!(obj instanceof Object[])) {
                    return null;
                }
                if (!(((Object[]) obj)[0] instanceof Object[])) {
                    return new mep(((String[]) obj)[0], new String[][]{obj});
                }
                String[][] strArr = (String[][]) obj;
                return new mep(strArr[0][0], strArr);
            }
        }
        return null;
    }

    public final int z0() {
        ArrayList<mep> arrayList = this.n;
        if (arrayList.size() == 0) {
            return 0;
        }
        return arrayList.size() + 1;
    }
}
