package ru.ozon.android.messenger.framework.core.viewmapper;

import X4.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes6.dex */
public abstract class a<State, VO extends g, B extends X4.a> extends d<State, VO> {

    /* renamed from: ru.ozon.android.messenger.framework.core.viewmapper.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1563a {

        /* renamed from: ru.ozon.android.messenger.framework.core.viewmapper.a$a$a, reason: collision with other inner class name */
        public static final class C1564a extends AbstractC1563a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1564a f87356a = new C1564a(0);
        }

        /* renamed from: ru.ozon.android.messenger.framework.core.viewmapper.a$a$b */
        /* loaded from: classes10.dex */
        public static final class b extends AbstractC1563a {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f87357a;

            /* renamed from: b, reason: collision with root package name */
            private final Integer f87358b;

            /* renamed from: c, reason: collision with root package name */
            private final Float f87359c;

            /* renamed from: d, reason: collision with root package name */
            private final Integer f87360d;

            /* renamed from: e, reason: collision with root package name */
            private final Integer f87361e;

            public b() {
                this(31, null, null, null, null);
            }

            public final Float a() {
                return this.f87359c;
            }

            public final Integer b() {
                return this.f87358b;
            }

            public final Integer c() {
                return this.f87360d;
            }

            public final Integer d() {
                return this.f87357a;
            }

            public final Integer e() {
                return this.f87361e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.d(this.f87357a, bVar.f87357a) && Intrinsics.d(this.f87358b, bVar.f87358b) && Intrinsics.d(this.f87359c, bVar.f87359c) && Intrinsics.d(this.f87360d, bVar.f87360d) && Intrinsics.d(this.f87361e, bVar.f87361e);
            }

            public final int hashCode() {
                Integer num = this.f87357a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f87358b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Float f7 = this.f87359c;
                int hashCode3 = (hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
                Integer num3 = this.f87360d;
                int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f87361e;
                return hashCode4 + (num4 != null ? num4.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Message(customTopBubblePadding=");
                sb2.append(this.f87357a);
                sb2.append(", customBottomBubblePadding=");
                sb2.append(this.f87358b);
                sb2.append(", bubbleElevation=");
                sb2.append(this.f87359c);
                sb2.append(", customBubbleBackgroundColorRes=");
                sb2.append(this.f87360d);
                sb2.append(", mineCustomBubbleBackgroundColorRes=");
                return Ep.a.c(sb2, this.f87361e, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i11, Integer num, Integer num2, Integer num3, Integer num4) {
                super(0);
                Float valueOf = Float.valueOf(0.0f);
                num = (i11 & 1) != 0 ? null : num;
                num2 = (i11 & 2) != 0 ? null : num2;
                valueOf = (i11 & 4) != 0 ? null : valueOf;
                num3 = (i11 & 8) != 0 ? null : num3;
                num4 = (i11 & 16) != 0 ? null : num4;
                this.f87357a = num;
                this.f87358b = num2;
                this.f87359c = valueOf;
                this.f87360d = num3;
                this.f87361e = num4;
            }
        }

        public AbstractC1563a(int i11) {
        }
    }

    @NotNull
    public abstract AbstractC1563a getBlockContainerSettings();

    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return K.f71697a;
    }

    @NotNull
    public abstract InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, B> getInflate();

    public List<Object> getPayloads(@NotNull VO oldItem, @NotNull VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return null;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public e getViewMapperType() {
        return e.a.f87374a;
    }

    @NotNull
    public abstract Function2<B, ru.ozon.android.messenger.framework.core.d, q<VO, B>> getViewProducer();
}
