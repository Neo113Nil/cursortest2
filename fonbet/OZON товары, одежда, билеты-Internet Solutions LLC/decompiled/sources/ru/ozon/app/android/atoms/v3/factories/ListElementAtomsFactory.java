package ru.ozon.app.android.atoms.v3.factories;

import Sc.o;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.BulletListAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.NumberedListAtom;
import ru.ozon.app.android.atoms.v3.holders.listed.BulletListHolder;
import ru.ozon.app.android.atoms.v3.holders.listed.NumberedListHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.BulletListElementHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.IconTextMediumListElementHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.IconWithTitleListElementHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.ListElementHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.NumberedListElementHolder;
import ru.ozon.app.android.atoms.v3.holders.listelements.TableRowListElementHolder;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u000f\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/v3/factories/ListElementAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/reflect/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListElementAtomsFactory implements AtomsFactory {
    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(BulletListAtom.class))) {
            return new BulletListHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(NumberedListAtom.class))) {
            return new NumberedListHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.BulletListElement.class))) {
            return new BulletListElementHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.IconTextMediumListElement.class))) {
            return new IconTextMediumListElementHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.IconWithTitleMediumListElement.class))) {
            return new IconWithTitleListElementHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.NumberedListElement.class))) {
            return new NumberedListElementHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.TableRowListElement.class))) {
            return new TableRowListElementHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ListElementAtom.ListElement.class))) {
            return new ListElementHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Object obj;
        Object listElementHolder;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof BulletListAtom) {
            obj = new BulletListHolder(context, ((BulletListAtom) data).getContext());
        } else if (data instanceof NumberedListAtom) {
            obj = new NumberedListHolder(context, ((NumberedListAtom) data).getContext());
        } else if (data instanceof ListElementAtom) {
            ListElementAtom listElementAtom = (ListElementAtom) data;
            if (listElementAtom instanceof ListElementAtom.BulletListElement) {
                listElementHolder = new BulletListElementHolder(context, ((ListElementAtom.BulletListElement) data).getContext());
            } else if (listElementAtom instanceof ListElementAtom.IconTextMediumListElement) {
                listElementHolder = new IconTextMediumListElementHolder(context, ((ListElementAtom.IconTextMediumListElement) data).getContext());
            } else if (listElementAtom instanceof ListElementAtom.IconWithTitleMediumListElement) {
                listElementHolder = new IconWithTitleListElementHolder(context, ((ListElementAtom.IconWithTitleMediumListElement) data).getContext());
            } else if (listElementAtom instanceof ListElementAtom.NumberedListElement) {
                listElementHolder = new NumberedListElementHolder(context, ((ListElementAtom.NumberedListElement) data).getContext());
            } else if (listElementAtom instanceof ListElementAtom.TableRowListElement) {
                listElementHolder = new TableRowListElementHolder(context, ((ListElementAtom.TableRowListElement) data).getContext());
            } else if (listElementAtom instanceof ListElementAtom.ListElement) {
                listElementHolder = new ListElementHolder(context, ((ListElementAtom.ListElement) data).getContext());
            } else {
                throw new o();
            }
            obj = (AtomV3) ExtensionsKt.getExhaustive(listElementHolder);
        } else {
            obj = null;
        }
        return (Atom) ExtensionsKt.getExhaustive(obj);
    }
}
