package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import androidx.preference.Preference;
import androidx.recyclerview.widget.u;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public cb(l2a l2aVar) {
        this.a = 12;
        Objects.requireNonNull(l2aVar);
        this.b = l2aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        RemoteMediaClient q;
        int i = this.a;
        Message message4 = null;
        message4 = null;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((hc) obj).a();
                break;
            case 1:
                vm vmVar = (vm) obj;
                if (view == vmVar.i && (message3 = vmVar.k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == vmVar.l && (message2 = vmVar.n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == vmVar.o && (message = vmVar.q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                vmVar.F.obtainMessage(1, vmVar.b).sendToTarget();
                break;
            case 2:
                g02 g02Var = (g02) obj;
                if (g02Var.k && g02Var.isShowing()) {
                    if (!g02Var.m) {
                        TypedArray obtainStyledAttributes = g02Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        g02Var.l = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        g02Var.m = true;
                    }
                    if (g02Var.l) {
                        g02Var.cancel();
                        break;
                    }
                }
                break;
            case 3:
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                int i3 = materialCalendar.f;
                if (i3 == 2) {
                    materialCalendar.m(1);
                } else if (i3 == 1) {
                    materialCalendar.m(2);
                }
                materialCalendar.n(materialCalendar.getView());
                break;
            case 4:
                ((tac) obj).dismiss();
                break;
            case 5:
                e eVar = (e) obj;
                bbc bbcVar = eVar.e;
                if (bbcVar.x != null) {
                    bbcVar.s.removeMessages(2);
                }
                bbcVar.x = eVar.b;
                boolean isActivated = view.isActivated();
                boolean z = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) bbcVar.y.get(eVar.b.c);
                    i2 = num != null ? Math.max(1, num.intValue()) : 1;
                }
                eVar.b(z);
                eVar.d.setProgress(i2);
                eVar.b.j(i2);
                bbcVar.s.sendEmptyMessageDelayed(2, 500L);
                break;
            case 6:
                wac wacVar = (wac) obj;
                pbc pbcVar = wacVar.h.j.g;
                obc obcVar = wacVar.g;
                pbcVar.getClass();
                if (obcVar != null) {
                    pbc.b();
                    yz8 c = pbc.c();
                    lbc a = c.d.a();
                    if (a != null) {
                        List<obc> singletonList = Collections.singletonList(obcVar);
                        ArrayList arrayList = new ArrayList();
                        for (obc obcVar2 : singletonList) {
                            cbc cbcVar = (cbc) a.x.get(obcVar2.c);
                            if (cbcVar == null || !cbcVar.e) {
                                obcVar2.toString();
                            } else {
                                arrayList.add(obcVar2.b);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (a.g()) {
                                ebc ebcVar = c.e;
                                if (!(ebcVar instanceof dbc)) {
                                    a70.r("There is no currently selected dynamic group route.");
                                    break;
                                } else {
                                    ((dbc) ebcVar).o(arrayList);
                                }
                            } else if (a.n()) {
                                c.f();
                                a.toString();
                            } else {
                                a.toString();
                            }
                        }
                    }
                    wacVar.c.setVisibility(4);
                    wacVar.d.setVisibility(0);
                    break;
                } else {
                    yhk.s("route must not be null");
                    break;
                }
                break;
            case 7:
                g gVar = (g) obj;
                boolean c2 = gVar.c(gVar.b);
                boolean z2 = !c2;
                boolean e = gVar.b.e();
                zac zacVar = gVar.o;
                if (!c2) {
                    pbc pbcVar2 = zacVar.j.g;
                    obc obcVar3 = gVar.b;
                    pbcVar2.getClass();
                    if (obcVar3 == null) {
                        yhk.s("route must not be null");
                        break;
                    } else {
                        pbc.b();
                        yz8 c3 = pbc.c();
                        lbc a2 = c3.d.a();
                        if (a2 != null) {
                            if (!a2.o(obcVar3)) {
                                obcVar3.toString();
                            } else if (Collections.unmodifiableList(a2.v).contains(obcVar3)) {
                                obcVar3.toString();
                            } else if (a2.g()) {
                                ebc ebcVar2 = c3.e;
                                if (!(ebcVar2 instanceof dbc)) {
                                    a70.r("There is no currently selected dynamic group route.");
                                    break;
                                } else {
                                    ((dbc) ebcVar2).m(obcVar3.b);
                                }
                            } else if (a2.n()) {
                                c3.f();
                                a2.toString();
                            } else {
                                a2.toString();
                            }
                        }
                    }
                } else {
                    pbc pbcVar3 = zacVar.j.g;
                    obc obcVar4 = gVar.b;
                    pbcVar3.getClass();
                    if (obcVar4 == null) {
                        yhk.s("route must not be null");
                        break;
                    } else {
                        pbc.b();
                        yz8 c4 = pbc.c();
                        lbc a3 = c4.d.a();
                        if (a3 != null) {
                            cbc cbcVar2 = (cbc) a3.x.get(obcVar4.c);
                            if (cbcVar2 == null || !cbcVar2.c) {
                                obcVar4.toString();
                            } else if (!Collections.unmodifiableList(a3.v).contains(obcVar4)) {
                                obcVar4.toString();
                            } else if (Collections.unmodifiableList(a3.v).size() > 1) {
                                if (a3.g()) {
                                    ebc ebcVar3 = c4.e;
                                    if (!(ebcVar3 instanceof dbc)) {
                                        a70.r("There is no currently selected dynamic group route.");
                                        break;
                                    } else {
                                        ((dbc) ebcVar3).n(obcVar4.b);
                                    }
                                } else if (a3.n()) {
                                    c4.f();
                                    a3.toString();
                                } else {
                                    a3.toString();
                                }
                            }
                        }
                    }
                }
                gVar.d(z2, !e);
                if (e) {
                    List unmodifiableList = Collections.unmodifiableList(zacVar.j.j.v);
                    for (obc obcVar5 : Collections.unmodifiableList(gVar.b.v)) {
                        if (unmodifiableList.contains(obcVar5) != z2) {
                            e eVar2 = (e) zacVar.j.w.get(obcVar5.c);
                            if (eVar2 instanceof g) {
                                ((g) eVar2).d(z2, true);
                            }
                        }
                    }
                }
                bbc bbcVar2 = zacVar.j;
                obc obcVar6 = gVar.b;
                List unmodifiableList2 = Collections.unmodifiableList(bbcVar2.j.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (obcVar6.e()) {
                    Iterator it = Collections.unmodifiableList(obcVar6.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((obc) it.next()) != z2) {
                            max += !c2 ? 1 : -1;
                        }
                    }
                } else {
                    max += c2 ? -1 : 1;
                }
                int i4 = (!bbcVar2.T || Collections.unmodifiableList(bbcVar2.j.v).size() <= 1) ? 0 : 1;
                r5 = (!bbcVar2.T || max < 2) ? 0 : 1;
                if (i4 != r5) {
                    u findViewHolderForAdapterPosition = bbcVar2.t.findViewHolderForAdapterPosition(0);
                    if (findViewHolderForAdapterPosition instanceof f) {
                        f fVar = (f) findViewHolderForAdapterPosition;
                        zacVar.o(r5 != 0 ? fVar.g : 0, fVar.itemView);
                        break;
                    }
                }
                break;
            case 8:
                ((y7e) obj).x.showPrivacyActivity();
                break;
            case 9:
                ((Preference) obj).r(view);
                break;
            case 10:
                ckj ckjVar = ((Toolbar) obj).M;
                efc efcVar = ckjVar != null ? ckjVar.b : null;
                if (efcVar != null) {
                    efcVar.collapseActionView();
                    break;
                }
                break;
            case 11:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i5 = TrackSelectionView.m;
                HashMap hashMap = trackSelectionView.g;
                if (view == trackSelectionView.c) {
                    trackSelectionView.l = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    ftj ftjVar = (ftj) tag;
                    suj sujVar = ftjVar.a;
                    osj osjVar = sujVar.b;
                    int i6 = ftjVar.b;
                    zsj zsjVar = (zsj) hashMap.get(osjVar);
                    if (zsjVar == null) {
                        if (!trackSelectionView.i && !hashMap.isEmpty()) {
                            hashMap.clear();
                        }
                        hashMap.put(osjVar, new zsj(osjVar, hv9.z(Integer.valueOf(i6))));
                    } else {
                        ArrayList arrayList2 = new ArrayList(zsjVar.b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        Object[] objArr = trackSelectionView.h && sujVar.c;
                        if (objArr == false && (!trackSelectionView.i || trackSelectionView.f.size() <= 1)) {
                            r5 = 0;
                        }
                        if (isChecked && r5 != 0) {
                            arrayList2.remove(Integer.valueOf(i6));
                            if (arrayList2.isEmpty()) {
                                hashMap.remove(osjVar);
                            } else {
                                hashMap.put(osjVar, new zsj(osjVar, arrayList2));
                            }
                        } else if (!isChecked) {
                            if (objArr == true) {
                                arrayList2.add(Integer.valueOf(i6));
                                hashMap.put(osjVar, new zsj(osjVar, arrayList2));
                            } else {
                                hashMap.put(osjVar, new zsj(osjVar, hv9.z(Integer.valueOf(i6))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
            case 12:
                l2a l2aVar = (l2a) obj;
                View view2 = (View) l2aVar.d;
                if (view2 != null) {
                    ((Activity) l2aVar.b).runOnUiThread(new wjn(i2 == true ? 1 : 0, l2aVar, view2));
                    break;
                }
                break;
            case 13:
                ((zzbys) obj).f(true);
                break;
            case 14:
                ((zzdxf) obj).j.zza();
                break;
            default:
                ExpandedControllerActivity expandedControllerActivity = (ExpandedControllerActivity) obj;
                if (expandedControllerActivity.N.isClickable() && (q = expandedControllerActivity.q()) != null) {
                    Preconditions.e("Must be called from the main thread.");
                    if (q.G()) {
                        RemoteMediaClient.I(new cbn(q, 6, i2));
                        break;
                    } else {
                        RemoteMediaClient.F();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ cb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public cb(zzbys zzbysVar) {
        this.a = 13;
        Objects.requireNonNull(zzbysVar);
        this.b = zzbysVar;
    }
}
