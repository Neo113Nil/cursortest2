package Hh;

import Gh.r;
import android.content.Context;
import android.content.SharedPreferences;
import io.radar.sdk.L0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4976c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4977a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingDeque f4978b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Hh.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f4979a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f4980b;

        public b(List list, i iVar) {
            this.f4979a = list;
            this.f4980b = iVar;
        }

        @Override // Hh.b
        public void a(boolean z10) {
            if (z10) {
                this.f4980b.f4978b.removeAll(this.f4979a);
                LinkedBlockingDeque linkedBlockingDeque = this.f4980b.f4978b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedBlockingDeque, 10));
                Iterator it = linkedBlockingDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r) it.next()).c());
                }
                JSONArray jSONArray = new JSONArray((Collection) arrayList);
                i iVar = this.f4980b;
                SharedPreferences.Editor editor = iVar.g(iVar.f4977a).edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.putString("radar-replays", jSONArray.toString());
                editor.apply();
            }
        }

        @Override // Hh.b
        public List get() {
            return this.f4979a;
        }
    }

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4977a = context;
        this.f4978b = new LinkedBlockingDeque(120);
    }

    @Override // Hh.e
    public void a(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        if (this.f4978b.size() >= 120) {
            this.f4978b.removeFirst();
        }
        this.f4978b.offer(new r(replayParams));
        if (L0.f49705a.s(this.f4977a).l()) {
            if (this.f4978b.size() <= 50) {
                LinkedBlockingDeque linkedBlockingDeque = this.f4978b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedBlockingDeque, 10));
                Iterator it = linkedBlockingDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r) it.next()).c());
                }
                JSONArray jSONArray = new JSONArray((Collection) arrayList);
                SharedPreferences.Editor editor = g(this.f4977a).edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.putString("radar-replays", jSONArray.toString());
                editor.apply();
                return;
            }
            LinkedBlockingDeque linkedBlockingDeque2 = this.f4978b;
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (Object obj : linkedBlockingDeque2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i10 % 5 != 0) {
                    arrayList2.add(obj);
                }
                i10 = i11;
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((r) it2.next()).c());
            }
            JSONArray jSONArray2 = new JSONArray((Collection) arrayList3);
            SharedPreferences.Editor editor2 = g(this.f4977a).edit();
            Intrinsics.checkNotNullExpressionValue(editor2, "editor");
            editor2.putString("radar-replays", jSONArray2.toString());
            editor2.apply();
        }
    }

    @Override // Hh.e
    public Hh.b b() {
        return new b(CollectionsKt.toList(this.f4978b), this);
    }

    @Override // Hh.e
    public void c() {
        String string = g(this.f4977a).getString("radar-replays", null);
        if (string != null) {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject replayAsJsonObject = jSONArray.getJSONObject(i10);
                r.a aVar = r.f4179b;
                Intrinsics.checkNotNullExpressionValue(replayAsJsonObject, "replayAsJsonObject");
                this.f4978b.offer(aVar.a(replayAsJsonObject));
            }
        }
    }

    public final SharedPreferences g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarReplayBufferPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @Override // Hh.e
    public int getSize() {
        return this.f4978b.size();
    }
}
