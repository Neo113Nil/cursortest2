package ru.ozon.android.messenger.blocks.header;

import a1.C4912a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.android.messenger.blocks.header.s;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.screen.j;
import ru.ozon.android.messenger.framework.presentation.models.k;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MViewChatHeaderBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class p extends ru.ozon.android.messenger.framework.core.viewmapper.b<ChatHeaderDTO, s, MViewChatHeaderBinding> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ n f85313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatHeaderDTO> f85314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f85315d;

    /* renamed from: e, reason: collision with root package name */
    private ru.ozon.android.messenger.utils.view.m f85316e;

    static final class a extends AbstractC7737t implements Function0<o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.b f85317b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.b bVar) {
            super(0);
            this.f85317b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o invoke() {
            return new o(this.f85317b);
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, ChatHeaderDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85318b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatHeaderDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ChatHeaderDTO) this.f85318b.fromJson(state, ChatHeaderDTO.class);
        }
    }

    public p(@NotNull JsonParser deserializer, @NotNull d.b blockCustomSettings) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f85313b = new n();
        this.f85314c = new b(deserializer);
        this.f85315d = ru.ozon.android.messenger.utils.f.b(new a(blockCustomSettings));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MViewChatHeaderBinding mViewChatHeaderBinding, ru.ozon.android.messenger.framework.core.d references, s sVar) {
        MViewChatHeaderBinding binding = mViewChatHeaderBinding;
        s viewObject = sVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        EE.b bVar = new EE.b(4, viewObject, references);
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).addView(binding.getConstraintLayout());
        binding.backIv.setOnClickListener(new DN.a(rootView, 10));
        binding.chatAvatarView.setOnClickListener(bVar);
        binding.chatTitleTv.setOnClickListener(bVar);
        Context context = rootView.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Window window = ((androidx.appcompat.app.g) context).getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        this.f85316e = new ru.ozon.android.messenger.utils.view.m(window);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, final ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        int parseColor;
        int i11;
        int i12;
        int i13;
        int i14;
        MViewChatHeaderBinding binding = (MViewChatHeaderBinding) aVar;
        s viewObject = (s) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ru.ozon.android.messenger.utils.h.b(context)) {
            Context context2 = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            parseColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor0);
            int color = binding.getConstraintLayout().getContext().getColor(R$color.graphic_tertiary_on_dark);
            ImageView imageView = binding.backIv;
            imageView.setBackgroundColor(parseColor);
            ru.ozon.android.messenger.utils.view.s.b(imageView, parseColor);
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            imageView.setImageTintList(ColorStateList.valueOf(color));
        } else {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context3 = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            String d11 = viewObject.d();
            Context context4 = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            parseColor = styleParser.parseColor(context3, d11, ThemeExtKt.themeColorRes(context4, R$attr.layerFloor1));
        }
        binding.getConstraintLayout().setBackgroundColor(parseColor);
        ru.ozon.android.messenger.utils.view.m mVar = this.f85316e;
        if (mVar != null) {
            mVar.a(parseColor);
        }
        View view = binding.headerActionClickableView;
        if (viewObject.a() == null) {
            view.setBackground(null);
        } else {
            view.setBackground(ru.ozon.android.messenger.utils.h.b(ru.ozon.android.messenger.framework.core.f.a(references)) ? androidx.core.content.a.getDrawable(view.getContext(), R$drawable.m_ripple_rect_round_select) : androidx.core.content.a.getDrawable(view.getContext(), R$drawable.ripple_rect_round_whitewave));
            view.setOnClickListener(new QD.b(4, references, viewObject));
        }
        d.a f7 = ru.ozon.android.messenger.utils.g.f(references.d());
        Map<String, MessengerTrackingInfo> l11 = viewObject.l();
        if (l11 != null) {
            references.c().s(l11);
        }
        TextAtomV2View textAtomV2View = binding.chatTitleTv;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, viewObject.j(), null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        LinearLayout chatIconsLayout = binding.chatIconsLayout;
        Intrinsics.checkNotNullExpressionValue(chatIconsLayout, "chatIconsLayout");
        List<s.a> k11 = viewObject.k();
        ArrayList arrayList = new ArrayList(C7714v.z(k11, 10));
        Iterator<T> it = k11.iterator();
        while (it.hasNext()) {
            arrayList.add(((s.a) it.next()).a());
        }
        i11 = ru.ozon.android.messenger.utils.e.f91905b;
        i12 = ru.ozon.android.messenger.utils.e.f91912i;
        ru.ozon.android.messenger.utils.view.g.a(chatIconsLayout, arrayList, f7, i11, i12, Integer.valueOf(R$color.text_primary));
        if (viewObject.b() != null) {
            ComposeView chatAvatarView = binding.chatAvatarView;
            Intrinsics.checkNotNullExpressionValue(chatAvatarView, "chatAvatarView");
            ru.ozon.android.messenger.utils.view.s.d(chatAvatarView);
            binding.chatAvatarView.a(new C4912a(true, -1934823815, new r(viewObject)));
        } else {
            ComposeView chatAvatarView2 = binding.chatAvatarView;
            Intrinsics.checkNotNullExpressionValue(chatAvatarView2, "chatAvatarView");
            ru.ozon.android.messenger.utils.view.s.a(chatAvatarView2);
            if (viewObject.f() == ChatHeaderDTO.a.ONLINE) {
                Icon icon = new Icon("ic_s_dot", "bgPositivePrimary");
                List<s.a> k12 = viewObject.k();
                ArrayList arrayList2 = new ArrayList(C7714v.z(k12, 10));
                Iterator<T> it2 = k12.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((s.a) it2.next()).a());
                }
                ArrayList q02 = C7714v.q0(icon, arrayList2);
                d.a f11 = ru.ozon.android.messenger.utils.g.f(references.d());
                LinearLayout chatIconsLayout2 = binding.chatIconsLayout;
                Intrinsics.checkNotNullExpressionValue(chatIconsLayout2, "chatIconsLayout");
                i13 = ru.ozon.android.messenger.utils.e.f91905b;
                i14 = ru.ozon.android.messenger.utils.e.f91912i;
                ru.ozon.android.messenger.utils.view.g.a(chatIconsLayout2, q02, f11, i13, i14, Integer.valueOf(R$color.text_primary));
            }
        }
        List<TextDTO> i15 = viewObject.i();
        binding.headerSubtitleContainerLl.removeAllViews();
        LinearLayout headerSubtitleContainerLl = binding.headerSubtitleContainerLl;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleContainerLl, "headerSubtitleContainerLl");
        ru.ozon.android.messenger.utils.view.s.e(headerSubtitleContainerLl, i15 != null ? Boolean.valueOf(!i15.isEmpty()) : null);
        if (i15 != null) {
            for (TextDTO textDTO : i15) {
                Context context5 = binding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                TextAtomV2View textAtomV2View2 = new TextAtomV2View(context5, null, 0, 6, null);
                binding.headerSubtitleContainerLl.addView(textAtomV2View2, new LinearLayout.LayoutParams(-2, -2));
                textAtomV2View2.setTextIsSelectable(false);
                TextHolderKt.bindOrGone$default(textAtomV2View2, textDTO, null, 2, null);
            }
        }
        ImageView headerIv = binding.headerButtonIv;
        Intrinsics.checkNotNullExpressionValue(headerIv, "headerButtonIv");
        final List<ButtonV3Atom.SmallButtonWithIcon> buttons = viewObject.e();
        Intrinsics.checkNotNullParameter(headerIv, "headerIv");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        final n nVar = this.f85313b;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(headerIv, "headerIv");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        d.a f12 = ru.ozon.android.messenger.utils.g.f(references.d());
        headerIv.setVisibility(buttons.isEmpty() ? 8 : 0);
        if (buttons.size() == 1) {
            ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon = (ButtonV3Atom.SmallButtonWithIcon) C7714v.K(buttons);
            Map<String, TokenizedTrackingInfo> trackingInfo = smallButtonWithIcon.getTrackingInfo();
            if (trackingInfo != null) {
                references.c().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
            }
            ru.ozon.android.messenger.utils.image.c.b(headerIv, new Icon(smallButtonWithIcon.getIcon(), smallButtonWithIcon.getTintColor()), null, f12);
            headerIv.setOnClickListener(new EE.a(11, smallButtonWithIcon, references));
        } else if (buttons.size() > 1) {
            headerIv.setImageResource(R$drawable.ic_m_kebab);
            headerIv.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.header.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    n.this.getClass();
                    G parentFragmentManager = references.d().getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    int i16 = ru.ozon.android.messenger.framework.presentation.common.screen.j.f91127e;
                    List<ButtonV3Atom.SmallButtonWithIcon> list = buttons;
                    ArrayList arrayList3 = new ArrayList(C7714v.z(list, 10));
                    for (ButtonV3Atom.SmallButtonWithIcon button : list) {
                        Intrinsics.checkNotNullParameter(button, "button");
                        String obj = button.getText().toString();
                        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                        arrayList3.add(new k.b(obj, new Icon(button.getIcon(), null), button.getAction()));
                    }
                    j.a.a(arrayList3).show(parentFragmentManager, (String) null);
                }
            });
        }
        ImageView backIv = binding.backIv;
        Intrinsics.checkNotNullExpressionValue(backIv, "backIv");
        ru.ozon.android.messenger.utils.view.s.e(backIv, Boolean.valueOf(viewObject.c()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (o) this.f85315d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatHeaderDTO> getParser() {
        return this.f85314c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MViewChatHeaderBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MViewChatHeaderBinding inflate = MViewChatHeaderBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MViewChatHeaderBinding mViewChatHeaderBinding, ru.ozon.android.messenger.framework.core.d references) {
        MViewChatHeaderBinding binding = mViewChatHeaderBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85316e = null;
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.getConstraintLayout());
    }
}
