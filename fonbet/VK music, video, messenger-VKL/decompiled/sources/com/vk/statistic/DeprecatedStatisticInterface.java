package com.vk.statistic;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public interface DeprecatedStatisticInterface extends Serializer.StreamParcelable {

    public static class a {
        public final HashMap<String, ArrayList<DeprecatedStatisticUrl>> a = new HashMap<>();

        public final void a(DeprecatedStatisticUrl deprecatedStatisticUrl) {
            String str = deprecatedStatisticUrl.b;
            HashMap<String, ArrayList<DeprecatedStatisticUrl>> hashMap = this.a;
            ArrayList<DeprecatedStatisticUrl> arrayList = hashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(deprecatedStatisticUrl.b, arrayList);
            }
            arrayList.add(deprecatedStatisticUrl);
        }

        @NonNull
        public final ArrayList b(String str) {
            ArrayList<DeprecatedStatisticUrl> arrayList = this.a.get(str);
            return arrayList == null ? new ArrayList() : arrayList;
        }

        public final int c(String str) {
            ArrayList<DeprecatedStatisticUrl> arrayList = this.a.get(str);
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public final void d(Serializer serializer) {
            int u = serializer.u();
            for (int i = 0; i < u; i++) {
                String H = serializer.H();
                ArrayList<DeprecatedStatisticUrl> j = serializer.j(DeprecatedStatisticUrl.CREATOR);
                if (j != null) {
                    this.a.put(H, j);
                }
            }
        }

        public final void e(Serializer serializer) {
            HashMap<String, ArrayList<DeprecatedStatisticUrl>> hashMap = this.a;
            serializer.S(hashMap.size());
            for (Map.Entry<String, ArrayList<DeprecatedStatisticUrl>> entry : hashMap.entrySet()) {
                serializer.j0(entry.getKey());
                serializer.o0(entry.getValue());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Objects.hash(this.a);
        }
    }

    List<DeprecatedStatisticUrl> R6(String str);

    int Wa();

    int Y7(String str);

    void h(DeprecatedStatisticUrl deprecatedStatisticUrl);

    void x4(String str);
}
