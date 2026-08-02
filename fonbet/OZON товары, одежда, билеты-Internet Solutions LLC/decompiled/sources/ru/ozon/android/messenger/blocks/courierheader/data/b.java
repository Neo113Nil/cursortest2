package ru.ozon.android.messenger.blocks.courierheader.data;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.databinding.MCourierHeaderBlockBinding;

/* loaded from: classes10.dex */
public final class b extends ru.ozon.android.messenger.framework.core.viewmapper.a<CourierHeaderDTO, ru.ozon.android.messenger.blocks.courierheader.presentation.a, MCourierHeaderBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MCourierHeaderBlockBinding> f84941a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<MCourierHeaderBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.courierheader.presentation.a, MCourierHeaderBlockBinding>> f84942b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f84943c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, CourierHeaderDTO> f84944d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f84945e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MCourierHeaderBlockBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84946a = new a(3, MCourierHeaderBlockBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MCourierHeaderBlockBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MCourierHeaderBlockBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MCourierHeaderBlockBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.courierheader.data.b$b, reason: collision with other inner class name */
    static final class C1485b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.courierheader.data.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1485b f84947b = new C1485b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.courierheader.data.a invoke() {
            return new ru.ozon.android.messenger.blocks.courierheader.data.a();
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<String, CourierHeaderDTO> {
        @Override // kotlin.jvm.functions.Function1
        public final CourierHeaderDTO invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (CourierHeaderDTO) ((JsonParser) this.receiver).fromJson(p02, CourierHeaderDTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MCourierHeaderBlockBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.courierheader.presentation.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f84948a = new d(2, ru.ozon.android.messenger.blocks.courierheader.presentation.b.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MCourierHeaderBlockBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.courierheader.presentation.b invoke(MCourierHeaderBlockBinding mCourierHeaderBlockBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MCourierHeaderBlockBinding p02 = mCourierHeaderBlockBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.courierheader.presentation.b(p02, p12);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84941a = a.f84946a;
        this.f84942b = d.f84948a;
        this.f84943c = a.AbstractC1563a.C1564a.f87356a;
        this.f84944d = new c(1, deserializer, ru.ozon.android.messenger.framework.data.remote.serialize.a.class, "fromJson", "fromJson(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Ljava/lang/String;)Ljava/lang/Object;", 1);
        this.f84945e = f.b(C1485b.f84947b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f84943c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MCourierHeaderBlockBinding> getInflate() {
        return this.f84941a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<CourierHeaderDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.courierheader.presentation.a>> getMapper() {
        return (Function2) this.f84945e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, CourierHeaderDTO> getParser() {
        return this.f84944d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MCourierHeaderBlockBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.courierheader.presentation.a, MCourierHeaderBlockBinding>> getViewProducer() {
        return this.f84942b;
    }
}
