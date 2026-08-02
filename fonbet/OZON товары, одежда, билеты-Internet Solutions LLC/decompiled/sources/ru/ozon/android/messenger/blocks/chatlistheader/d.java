package ru.ozon.android.messenger.blocks.chatlistheader;

import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MChatListHeaderTextBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.b<ChatListHeaderDTO, f, MChatListHeaderTextBinding> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ru.ozon.android.messenger.blocks.chatlistheader.b f84734b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f84735c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatListHeaderDTO> f84736d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f84737e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84738a;

        static {
            int[] iArr = new int[TextDTO.TextAlignment.values().length];
            try {
                iArr[TextDTO.TextAlignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextDTO.TextAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextDTO.TextAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84738a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.chatlistheader.c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.b f84739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d.b bVar) {
            super(0);
            this.f84739b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.chatlistheader.c invoke() {
            return new ru.ozon.android.messenger.blocks.chatlistheader.c(this.f84739b);
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, ChatListHeaderDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f84740b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatListHeaderDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ChatListHeaderDTO) this.f84740b.fromJson(state, ChatListHeaderDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer, @NotNull d.b blockCustomSettings, ru.ozon.android.messenger.framework.logger.b bVar) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f84734b = new ru.ozon.android.messenger.blocks.chatlistheader.b();
        this.f84735c = bVar;
        this.f84736d = new c(deserializer);
        this.f84737e = ru.ozon.android.messenger.utils.f.b(new b(blockCustomSettings));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MChatListHeaderTextBinding mChatListHeaderTextBinding, ru.ozon.android.messenger.framework.core.d references, f fVar) {
        MChatListHeaderTextBinding binding = mChatListHeaderTextBinding;
        f viewObject = fVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).addView(binding.getConstraintLayout(), 0);
        FrameLayout frameLayout = binding.navbarContainer;
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.c d11 = viewObject.d();
        TextAtomV2View textAtomV2View = null;
        if (d11 instanceof f.c.b) {
            TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
            f.c.b bVar = (f.c.b) d11;
            TextHolderKt.bindOrGone$default(textAtomV2View2, bVar.a(), null, 2, null);
            textAtomV2View2.setTextIsSelectable(false);
            TextDTO.TextAlignment textAlignment = bVar.a().getTextAlignment();
            int i11 = textAlignment == null ? -1 : a.f84738a[textAlignment.ordinal()];
            int i12 = 8388611;
            if (i11 != -1 && i11 != 1) {
                if (i11 == 2) {
                    i12 = 17;
                } else {
                    if (i11 != 3) {
                        throw new o();
                    }
                    i12 = 8388613;
                }
            }
            textAtomV2View2.setGravity(i12);
            textAtomV2View = textAtomV2View2;
        } else {
            ru.ozon.android.messenger.framework.logger.b bVar2 = this.f84735c;
            if (bVar2 != null) {
                bVar2.log(d11 + " не реализован");
            }
        }
        frameLayout.addView(textAtomV2View);
        binding.backIv.setOnClickListener(new AU.a(references, 11));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MChatListHeaderTextBinding binding = (MChatListHeaderTextBinding) aVar;
        f viewObject = (f) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ImageView backIv = binding.backIv;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        s.e(backIv, Boolean.valueOf(viewObject.b()));
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (h.b(context)) {
            Context context2 = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int themeColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor0);
            int color = rootView.getContext().getColor(R$color.graphic_tertiary_on_dark);
            binding.getConstraintLayout().setBackgroundColor(themeColor);
            ImageView backIv2 = binding.backIv;
            Intrinsics.checkNotNullExpressionValue(backIv2, "backIv");
            s.b(backIv2, themeColor);
            ImageView backIv3 = binding.backIv;
            Intrinsics.checkNotNullExpressionValue(backIv3, "backIv");
            Intrinsics.checkNotNullParameter(backIv3, "<this>");
            backIv3.setImageTintList(ColorStateList.valueOf(color));
        }
        LinearLayout menuContainer = binding.menuItemsContainer;
        Intrinsics.checkNotNullExpressionValue(menuContainer, "menuItemsContainer");
        List<f.b> headerMenuItems = viewObject.c();
        Intrinsics.checkNotNullParameter(menuContainer, "menuContainer");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        this.f84734b.getClass();
        ru.ozon.android.messenger.blocks.chatlistheader.b.a(menuContainer, references, headerMenuItems);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof BlockDTO) {
            try {
                return ((ChatListHeaderDTO) ((c) this.f84736d).invoke(((BlockDTO) obj).getState())).getMainItem().getTitle() != null;
            } catch (Throwable th2) {
                ru.ozon.android.messenger.framework.logger.b bVar = this.f84735c;
                if (bVar != null) {
                    bVar.log(th2);
                }
                return false;
            }
        }
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            if ((eVar.b() instanceof f) && (((f) eVar.b()).d() instanceof f.c.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.chatlistheader.c) this.f84737e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatListHeaderDTO> getParser() {
        return this.f84736d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MChatListHeaderTextBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MChatListHeaderTextBinding inflate = MChatListHeaderTextBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MChatListHeaderTextBinding mChatListHeaderTextBinding, ru.ozon.android.messenger.framework.core.d references) {
        MChatListHeaderTextBinding binding = mChatListHeaderTextBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.getConstraintLayout());
    }
}
