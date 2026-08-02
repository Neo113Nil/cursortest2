package ru.ozon.android.messenger.framework.core.initialization.newinit;

import android.app.Application;
import android.content.Context;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.parsing.AtomParserModel;
import ru.ozon.uni.atoms.parsing.ParserStateHolder;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ru.ozon.android.messenger.framework.core.initialization.b f87344a = new ru.ozon.android.messenger.framework.core.initialization.b();

    public static void a(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        ParserStateHolder parserStateHolder = ParserStateHolder.INSTANCE;
        AtomParserModel[] elements = {new AtomParserModel(AtomTypeImpl.SMALL_BUTTON.getValue(), ButtonV3Atom.SmallButton.class), new AtomParserModel(AtomTypeImpl.SMALL_BORDERLESS_BUTTON.getValue(), ButtonV3Atom.SmallBorderlessButton.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        parserStateHolder.initialize(C7705l.j0(elements));
        Pi.a galleryConfig = new Pi.a(appContext);
        Intrinsics.checkNotNullParameter(galleryConfig, "galleryConfig");
        Pi.b.b(galleryConfig);
        Application application = appContext instanceof Application ? (Application) appContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(f87344a);
        }
    }
}
