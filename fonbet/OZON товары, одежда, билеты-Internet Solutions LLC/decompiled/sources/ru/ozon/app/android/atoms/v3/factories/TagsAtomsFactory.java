package ru.ozon.app.android.atoms.v3.factories;

import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.tags.CrossColorTagHolder;
import ru.ozon.app.android.atoms.v3.holders.tags.WrappedSmallLinkTagHolder;
import ru.ozon.app.android.atoms.v3.holders.tags.crosstag.CrossTagHolder;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolder;
import ru.ozon.uni.atoms.v3.holders.tags.WrappedLinkTagHolder;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0015\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u0015\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/v3/factories/TagsAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Lru/ozon/uni/atoms/data/tag/TagV3Atom;", "dto", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/view/View;", "parseTag", "(Lru/ozon/uni/atoms/data/tag/TagV3Atom;Landroid/content/Context;)Lru/ozon/uni/atoms/v3/AtomV3;", "Lkotlin/reflect/d;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsAtomsFactory implements AtomsFactory {
    private final AtomV3<? extends AtomDTO, ? extends View> parseTag(TagV3Atom dto, Context context) {
        Object crossColorTagHolder;
        if (dto instanceof TagV3Atom.TagAtom) {
            crossColorTagHolder = new TagHolder(context, ((TagV3Atom.TagAtom) dto).getContext());
        } else if (dto instanceof TagV3Atom.LinkTagAtom) {
            crossColorTagHolder = new WrappedLinkTagHolder(context, ((TagV3Atom.LinkTagAtom) dto).getContext());
        } else if (dto instanceof TagV3Atom.SmallLinkTagAtom) {
            crossColorTagHolder = new WrappedSmallLinkTagHolder(context, ((TagV3Atom.SmallLinkTagAtom) dto).getContext());
        } else if (dto instanceof TagV3Atom.CrossTagAtom) {
            crossColorTagHolder = new CrossTagHolder(context, ((TagV3Atom.CrossTagAtom) dto).getContext());
        } else {
            if (!(dto instanceof TagV3Atom.CrossColorTagAtom)) {
                throw new o();
            }
            crossColorTagHolder = new CrossColorTagHolder(context, ((TagV3Atom.CrossColorTagAtom) dto).getContext());
        }
        return (AtomV3) ExtensionsKt.getExhaustive(crossColorTagHolder);
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(TagV3Atom.TagAtom.class))) {
            return new TagHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagV3Atom.LinkTagAtom.class))) {
            return new WrappedLinkTagHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagV3Atom.SmallLinkTagAtom.class))) {
            return new WrappedSmallLinkTagHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagV3Atom.CrossTagAtom.class))) {
            return new CrossTagHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(TagV3Atom.CrossColorTagAtom.class))) {
            return new CrossColorTagHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof TagV3Atom) {
            return parseTag((TagV3Atom) data, context);
        }
        return null;
    }
}
