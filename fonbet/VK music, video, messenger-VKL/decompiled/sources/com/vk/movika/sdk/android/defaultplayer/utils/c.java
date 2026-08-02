package com.vk.movika.sdk.android.defaultplayer.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.vk.dto.user.RequestUserProfile;
import java.lang.reflect.Field;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.gkq0;
import xsna.gzs;
import xsna.hfz;
import xsna.izs;
import xsna.jav;
import xsna.n34;
import xsna.qul;
import xsna.rfz;
import xsna.sfz;
import xsna.wjf0;
import xsna.wzs;
import xsna.xe9;

/* loaded from: classes3.dex */
public class c implements rfz {
    public final Object a;
    public Object b;
    public final Object c;

    public c(View view, Object obj, boolean z, wzs wzsVar) {
        this.a = view;
        this.b = obj;
        this.c = wzsVar;
        if (!z || wzsVar == null) {
            return;
        }
    }

    @Override // xsna.rfz
    public void a(gkq0 gkq0Var, jav javVar, izs izsVar) {
        qul qulVar = (qul) ((gzs) this.a).invoke();
        if (qulVar == null) {
            return;
        }
        List<hfz> items = qulVar.getItems();
        izs izsVar2 = (izs) this.b;
        gzs gzsVar = (gzs) this.c;
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if (n34.c(hfzVar, gkq0Var.a, gkq0Var.b, izsVar2)) {
                RequestUserProfile requestUserProfile = (RequestUserProfile) izsVar2.invoke(hfzVar);
                if (requestUserProfile != null) {
                    izsVar.invoke(requestUserProfile);
                }
                RecyclerView recyclerView = (RecyclerView) gzsVar.invoke();
                if (recyclerView != null) {
                    wjf0.c(recyclerView, new sfz(qulVar, i, javVar, 0));
                }
            }
            i = i2;
        }
    }

    public void c(Object obj) {
        wzs wzsVar = (wzs) this.c;
        if (epx.f(this.b, obj)) {
            return;
        }
        if (wzsVar == null || ((Boolean) wzsVar.invoke(this.b, obj)).booleanValue()) {
            this.b = obj;
            ((View) this.a).invalidate();
        }
    }

    public Object d() {
        Object obj = this.b;
        Field field = (Field) this.a;
        Class cls = (Class) this.c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder a = xe9.a("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            a.append(name3);
            throw new zzbl(a.toString(), e);
        }
    }

    public void e(Object obj) {
        Object obj2 = this.b;
        Field field = (Field) this.a;
        try {
            field.set(obj2, obj);
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = ((Class) this.c).getName();
            StringBuilder a = xe9.a("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            a.append(name3);
            throw new zzbl(a.toString(), e);
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public c(Object obj, Field field, Class cls) {
        this.b = obj;
        this.a = field;
        this.c = cls;
    }
}
