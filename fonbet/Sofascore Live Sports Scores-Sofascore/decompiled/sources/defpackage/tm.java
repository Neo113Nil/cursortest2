package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tm extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public tm(avf avfVar) {
        this.b = new WeakReference(avfVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        cbc cbcVar;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                avf avfVar = (avf) this.b.get();
                if (avfVar != null) {
                    SparseArray sparseArray = avfVar.h;
                    gvf gvfVar = avfVar.i;
                    ArrayList arrayList = gvfVar.k;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    if (i2 != 0) {
                        bvf bvfVar = null;
                        switch (i2) {
                            case 2:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle = (Bundle) obj;
                                    if (avfVar.f == 0 && i3 == avfVar.g && i4 >= 1) {
                                        avfVar.g = 0;
                                        avfVar.f = i4;
                                        hbc a = hbc.a(bundle);
                                        if (gvfVar.n == avfVar) {
                                            gvfVar.i(a);
                                        }
                                        if (gvfVar.n == avfVar) {
                                            gvfVar.o = true;
                                            int size = arrayList.size();
                                            for (int i5 = 0; i5 < size; i5++) {
                                                ((bvf) arrayList.get(i5)).a(gvfVar.n);
                                            }
                                            oac oacVar = gvfVar.e;
                                            if (oacVar != null) {
                                                avf avfVar2 = gvfVar.n;
                                                int i6 = avfVar2.d;
                                                avfVar2.d = i6 + 1;
                                                avfVar2.b(10, i6, 0, oacVar.a, null);
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle2 = (Bundle) obj;
                                    dvf dvfVar = (dvf) sparseArray.get(i3);
                                    if (dvfVar != null) {
                                        sparseArray.remove(i3);
                                        dvfVar.a(bundle2);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (obj == null || (obj instanceof Bundle)) {
                                    if (peekData != null) {
                                        peekData.getString("error");
                                    }
                                    Bundle bundle3 = (Bundle) obj;
                                    if (((dvf) sparseArray.get(i3)) != null) {
                                        sparseArray.remove(i3);
                                        Objects.toString(bundle3);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle4 = (Bundle) obj;
                                    if (avfVar.f != 0) {
                                        hbc a2 = hbc.a(bundle4);
                                        if (gvfVar.n == avfVar) {
                                            gvfVar.i(a2);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 6:
                                if (obj instanceof Bundle) {
                                    Bundle bundle5 = (Bundle) obj;
                                    dvf dvfVar2 = (dvf) sparseArray.get(i3);
                                    if (bundle5.containsKey("routeId")) {
                                        sparseArray.remove(i3);
                                        dvfVar2.a(bundle5);
                                        break;
                                    } else {
                                        dvfVar2.getClass();
                                        Objects.toString(bundle5);
                                        break;
                                    }
                                }
                                break;
                            case 7:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle6 = (Bundle) obj;
                                    if (avfVar.f != 0) {
                                        Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                        mac macVar = bundle7 != null ? new mac(bundle7) : null;
                                        ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = parcelableArrayList.iterator();
                                        while (it.hasNext()) {
                                            Bundle bundle8 = (Bundle) it.next();
                                            if (bundle8 == null) {
                                                cbcVar = null;
                                            } else {
                                                Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                                cbcVar = new cbc(bundle9 != null ? new mac(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                            }
                                            arrayList2.add(cbcVar);
                                        }
                                        if (gvfVar.n == avfVar) {
                                            Iterator it2 = arrayList.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    bvf bvfVar2 = (bvf) it2.next();
                                                    if (bvfVar2.b() == i4) {
                                                        bvfVar = bvfVar2;
                                                    }
                                                }
                                            }
                                            if (bvfVar instanceof evf) {
                                                ((evf) bvfVar).l(macVar, arrayList2);
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 8:
                                if (gvfVar.n == avfVar) {
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bvf bvfVar3 = (bvf) it3.next();
                                            if (bvfVar3.b() == i4) {
                                                bvfVar = bvfVar3;
                                            }
                                        }
                                    }
                                    imf imfVar = gvfVar.p;
                                    if (imfVar != null && (bvfVar instanceof ebc)) {
                                        ebc ebcVar = (ebc) bvfVar;
                                        yz8 yz8Var = (yz8) ((vdb) imfVar.b).d;
                                        if (yz8Var.e == ebcVar) {
                                            yz8Var.k(yz8Var.c(), 2, true);
                                        }
                                    }
                                    if (bvfVar != null) {
                                        arrayList.remove(bvfVar);
                                        bvfVar.c();
                                        gvfVar.p();
                                        break;
                                    }
                                }
                                break;
                        }
                    } else {
                        if (i3 == avfVar.g) {
                            avfVar.g = 0;
                            if (gvfVar.n == avfVar) {
                                gvfVar.o();
                            }
                        }
                        if (((dvf) sparseArray.get(i3)) != null) {
                            sparseArray.remove(i3);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ tm() {
    }
}
