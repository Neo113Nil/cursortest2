package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5243a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5244b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f5243a = obj;
        this.f5244b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        g4 g4Var = (g4) this.f5243a;
        String str2 = (String) this.f5244b;
        Context context = (Context) g4Var.f5058b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        androidx.appcompat.widget.q4 q4Var = w3.f5333a;
        if (contentResolver == null) {
            q4Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (q4Var) {
            try {
                if (((HashMap) q4Var.f893c) == null) {
                    ((AtomicBoolean) q4Var.f892b).set(false);
                    q4Var.f893c = new HashMap(16, 1.0f);
                    q4Var.f898h = new Object();
                    contentResolver.registerContentObserver(x3.f5350a, true, new a1.a(q4Var));
                } else if (((AtomicBoolean) q4Var.f892b).getAndSet(false)) {
                    ((HashMap) q4Var.f893c).clear();
                    ((HashMap) q4Var.f894d).clear();
                    ((HashMap) q4Var.f895e).clear();
                    ((HashMap) q4Var.f896f).clear();
                    ((HashMap) q4Var.f897g).clear();
                    q4Var.f898h = new Object();
                }
                Object obj = q4Var.f898h;
                String str3 = null;
                if (((HashMap) q4Var.f893c).containsKey(str2)) {
                    String str4 = (String) ((HashMap) q4Var.f893c).get(str2);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    uri = x3.f5350a;
                    acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        acquireUnstableContentProviderClient.release();
                    }
                } catch (z3 unused) {
                }
                if (acquireUnstableContentProviderClient == null) {
                    throw new z3("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                    try {
                        if (query == null) {
                            throw new z3("ContentProvider query returned null cursor");
                        }
                        if (query.moveToFirst()) {
                            str = query.getString(1);
                            query.close();
                        } else {
                            query.close();
                            str = null;
                        }
                        if (str != null && str.equals(null)) {
                            str = null;
                        }
                        synchronized (q4Var) {
                            try {
                                if (obj == q4Var.f898h) {
                                    ((HashMap) q4Var.f893c).put(str2, str);
                                }
                            } finally {
                            }
                        }
                        if (str != null) {
                            return str;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e7) {
                    throw new z3("ContentProvider query failed", e7);
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        Iterator it = sVar.f5233a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f5243a).put(Integer.valueOf(((w) it.next()).f5329a).toString(), sVar);
        }
    }

    public n c(com.google.firebase.messaging.x xVar, n nVar) {
        ci.c.p0(xVar);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.f5159b;
        String str = oVar.f5158a;
        HashMap hashMap = (HashMap) this.f5243a;
        return (hashMap.containsKey(str) ? (s) hashMap.get(str) : (s) this.f5244b).a(str, xVar, arrayList);
    }

    public void d(com.google.firebase.messaging.x xVar, androidx.appcompat.app.v0 v0Var) {
        u4 u4Var = new u4(v0Var);
        TreeMap treeMap = (TreeMap) this.f5243a;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) v0Var.f365c).clone();
            n j = ((m) treeMap.get(num)).j(xVar, Collections.singletonList(u4Var));
            int l02 = j instanceof g ? ci.c.l0(((g) j).f5049a.doubleValue()) : -1;
            if (l02 == 2 || l02 == -1) {
                v0Var.f365c = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f5244b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n j6 = ((m) treeMap2.get((Integer) it.next())).j(xVar, Collections.singletonList(u4Var));
            if (j6 instanceof g) {
                ci.c.l0(((g) j6).f5049a.doubleValue());
            }
        }
    }

    public t(int i5) {
        switch (i5) {
            case 3:
                this.f5243a = new TreeMap();
                this.f5244b = new TreeMap();
                break;
            default:
                this.f5243a = new HashMap();
                this.f5244b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f5233a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f5233a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f5233a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f5233a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f5233a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f5233a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f5233a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                break;
        }
    }
}
