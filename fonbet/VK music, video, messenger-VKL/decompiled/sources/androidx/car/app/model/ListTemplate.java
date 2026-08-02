package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.alk;
import xsna.e8o0;
import xsna.ktx;
import xsna.sl9;

/* loaded from: classes11.dex */
public final class ListTemplate implements e8o0 {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Nullable
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;

    @Nullable
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;

    @Nullable
    private final ItemList mSingleList;

    @Nullable
    private final CarText mTitle;

    public static final class a {
        public final boolean a;

        @Nullable
        public final ItemList b;
        public final ArrayList c;

        @Nullable
        public final CarText d;

        @Nullable
        public final Action e;

        @Nullable
        public final ActionStrip f;
        public final ArrayList g;

        public a(@NonNull ListTemplate listTemplate) {
            this.a = listTemplate.isLoading();
            this.e = listTemplate.getHeaderAction();
            this.d = listTemplate.getTitle();
            this.b = listTemplate.getSingleList();
            this.c = new ArrayList(listTemplate.getSectionedLists());
            this.f = listTemplate.getActionStrip();
            this.g = new ArrayList(listTemplate.getActions());
        }
    }

    public static class b {
        public int a;
    }

    public ListTemplate(a aVar) {
        this.mIsLoading = aVar.a;
        this.mTitle = aVar.d;
        this.mHeaderAction = aVar.e;
        this.mSingleList = aVar.b;
        this.mSectionedLists = alk.H(aVar.c);
        this.mActionStrip = aVar.f;
        this.mActions = alk.H(aVar.g);
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        b bVar = new b();
        bVar.a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), bVar), sectionedItemList.getHeader().toCharSequence()));
            if (bVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, b bVar) {
        ItemList.a aVar = new ItemList.a(itemList);
        ArrayList arrayList = aVar.a;
        arrayList.clear();
        for (ktx ktxVar : itemList.getItems()) {
            if (!(ktxVar instanceof ConversationItem)) {
                if (bVar.a < 1) {
                    break;
                }
                Objects.requireNonNull(ktxVar);
                arrayList.add(ktxVar);
                bVar.a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) ktxVar;
                if (bVar.a < 2) {
                    break;
                }
                ConversationItem.b bVar2 = new ConversationItem.b(conversationItem);
                int i = bVar.a - 1;
                bVar.a = i;
                int min = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int min2 = Math.min(size, min);
                bVar2.f = conversationItem.getMessages().subList(size - min2, size);
                arrayList.add(new ConversationItem(bVar2));
                bVar.a -= min2;
            }
        }
        if (aVar.c != null) {
            int size2 = arrayList.size();
            if (size2 == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            int i2 = aVar.b;
            if (i2 >= size2) {
                throw new IllegalStateException(sl9.c(i2, size2, "The selected item index (", ") is larger than the size of the list (", ")"));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ktx ktxVar2 = (ktx) it.next();
                if (ItemList.getOnClickDelegate(ktxVar2) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(ktxVar2) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions);
    }

    @Nullable
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @NonNull
    public List<Action> getActions() {
        return this.mActions;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @NonNull
    public List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Nullable
    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public a toBuilder() {
        return new a(this);
    }

    @NonNull
    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
    }
}
